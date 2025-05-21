"use client"

import { JSX, useEffect } from "react"
import { motion, useAnimation } from "framer-motion"
import { useInView } from "react-intersection-observer"
import { ChevronRight, TrendingUp, BarChart3, Zap, Shield, Users, ArrowRight, CheckCircle2, BrainCircuit } from "lucide-react"
import type { LucideIcon } from "lucide-react"
import { Button } from "@/components/ui/button"
import { Card, CardContent } from "@/components/ui/card"
import { useAuthStore } from "@/store/useAuthStore"
import { useRouter } from "next/navigation"



interface FeatureCardProps {
  icon: LucideIcon;
  title: string;
  description: string;
  delay: number;
}

interface FeatureItem {
  icon: LucideIcon;
  title: string;
  description: string;
  delay: number;
}

interface WorkflowStep {
  step: number;
  title: string;
  description: string;
}


// Feature card component with glass effect
const FeatureCard = ({ icon: Icon, title, description, delay }: FeatureCardProps):  JSX.Element => {
  const controls = useAnimation()
  const [ref, inView] = useInView({ threshold: 0.2, triggerOnce: true })

  useEffect(() => {
    if (inView) {
      controls.start("visible")
    }
  }, [controls, inView])

  return (
    <motion.div
      ref={ref}
      initial="hidden"
      animate={controls}
      variants={{
        hidden: { opacity: 0, y: 50 },
        visible: { opacity: 1, y: 0, transition: { duration: 0.6, delay } },
      }}
    >
      <Card className="h-full border-none shadow-lg bg-white/80 dark:bg-neutral-900/80 backdrop-blur-sm hover:shadow-xl transition-shadow duration-300">
        <CardContent className="p-6 space-y-4">
          <div className="h-12 w-12 rounded-full bg-[#4CAF50]/10 flex items-center justify-center">
            <Icon className="h-6 w-6 text-[#4CAF50]" />
          </div>
          <h3 className="text-xl font-semibold">{title}</h3>
          <p className="text-muted-foreground dark:text-neutral-400">{description}</p>
        </CardContent>
      </Card>
    </motion.div>
  )
}

export default function HomePage(): JSX.Element {
  const heroControls = useAnimation()
  const [heroRef, heroInView] = useInView({ triggerOnce: true })

  useEffect(() => {
    if (heroInView) {
      heroControls.start("visible")
    }
  }, [heroControls, heroInView])

  const { isAuthenticated } = useAuthStore()
  const router = useRouter()


  const handleGetStarted = () => {
    if (isAuthenticated) {
      router.push("/strategy-builder")
    } else {
      router.push("/login")
    }
  }

  // Features data
  const features: FeatureItem[] = [
    {
      icon: Zap,
      title: "No-Code Strategy Builder",
      description:
        "Build complex quantitative strategies with our intuitive click and drop interface. No coding required.",
      delay: 0.1,
    },
    {
      icon: BarChart3,
      title: "Advanced Backtesting",
      description:
        "Test your strategies against historical data with detailed performance metrics and analytics.",
      delay: 0.2,
    },
    {
      icon: TrendingUp,
      title: "Portfolio creation",
      description: "Create equal & custom weighted portfolios with ease with rebalancing options.",
      delay: 0.3,
    },
    {
      icon: BrainCircuit,
      title: "Machine Learning & AI Strategy",
      description: "Use AI/ML techniques to build, combine and optimize strategies.",
      delay: 0.4,
    },
    {
      icon: Users,
      title: "Strategy Marketplace",
      description:
        "Discover and subscribe to proven strategies from professional Quant researchers in our marketplace.",
      delay: 0.5,
    },
    {
      icon: Shield,
      title: "Multi-Factor Model",
      description: "Create a multi-factor portfolios for reobust risk adjusted returns.",
      delay: 0.6,
    },
  ]

  // Workflow steps
  const workflowSteps: WorkflowStep[] = [
    {
      step: 1,
      title: "Build Your Strategy",
      description:
        "Use our visual strategy builder to create your quantitative strategies with time-series & cross-section operations.",
    },
    {
      step: 2,
      title: "Backtest & Optimize",
      description:
        "Test your strategy against historical data to validate performance and optimize parameters.",
    },
    {
      step: 3,
      title: "Portfolio Creation",
      description: "Create equal-weighted or custom-weighted portfolios with rebalancing options at ease.",
    },
  ]


  return (
    <div className="flex flex-col min-h-screen relative dark:bg-neutral-950">
      {/* Hero Section - Centered */}
      <section className="relative py-32 md:py-40 overflow-hidden">
        <div className="container px-4 mx-auto relative z-10">
          <motion.div
            ref={heroRef}
            initial="hidden"
            animate={heroControls}
            variants={{
              hidden: { opacity: 0, y: 30 },
              visible: {
                opacity: 1,
                y: 0,
                transition: {
                  duration: 0.1,
                  when: "beforeChildren",
                  staggerChildren: 0.2,
                },
              },
            }}
            className="max-w-4xl mx-auto text-center space-y-6"
          >
             
            <motion.div
              variants={{
                hidden: { opacity: 0, y: 20 },
                visible: { opacity: 1, y: 0 },
              }}
            >
              <span className="inline-block py-1 px-3 text-sm font-medium bg-[#4CAF50]/10 text-[#4CAF50] rounded-full mb-4 backdrop-blur-sm">
                Systematic Quantitative Research Platform
              </span>
            </motion.div>

            <motion.h1
              className="text-4xl md:text-5xl lg:text-6xl font-bold leading-tight dark:text-white"
              variants={{
                hidden: { opacity: 0, y: 20 },
                visible: { opacity: 1, y: 0 },
              }}
            >
              We Democratize <span className="text-[#4CAF50]">Quant Systematic </span> Investing 
            </motion.h1>

            <motion.p
              className="text-xl text-muted-foreground dark:text-neutral-300 max-w-2xl mx-auto"
              variants={{
                hidden: { opacity: 0, y: 20 },
                visible: { opacity: 1, y: 0 },
              }}
            >
              Create, backtest and deploy Quant AI/ML portfolios without writing code. Harness the power of
              data-driven decisions.
            </motion.p>

            <motion.div
              className="flex flex-col sm:flex-row gap-4 pt-4 justify-center"
              variants={{
                hidden: { opacity: 0, y: 20 },
                visible: { opacity: 1, y: 0, transition: { duration: 0.1 } },
              }}
            >
                <Button 
                size="lg" 
                className="bg-[#4CAF50] hover:bg-[#3d8b40]"
                onClick={handleGetStarted}
              >
               {isAuthenticated ? "Get Started" : "Login"} 
                <ChevronRight className="ml-2 h-4 w-4" />
              </Button>
              <Button size="lg" variant="outline" className="backdrop-blur-sm dark:border-neutral-800 dark:text-neutral-200">
                Watch Demo
              </Button>
            </motion.div>
          </motion.div>
        </div>
      </section>

      {/* Features Section */}
      <section className="py-20 relative">
        <div className="container px-4 mx-auto">
          <div className="text-center max-w-3xl mx-auto mb-16">
            <motion.h2
              className="text-3xl md:text-4xl font-bold mb-4 dark:text-white"
              initial={{ opacity: 0, y: 20 }}
              whileInView={{ opacity: 1, y: 0 }}
              transition={{ duration: 0.5 }}
              viewport={{ once: true }}
            >
              Why Choose <span className="text-[#4CAF50]">Kalpi Capital?</span>
            </motion.h2>
            <motion.p
              className="text-xl text-muted-foreground dark:text-neutral-300"
              initial={{ opacity: 0, y: 20 }}
              whileInView={{ opacity: 1, y: 0 }}
              transition={{ duration: 0.5, delay: 0.2 }}
              viewport={{ once: true }}
            >
              Our platform combines powerful technology with an intuitive interface to help you succeed in systematic portfolio construction.
            </motion.p>
          </div>

          <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
            {features.map((feature, index) => (
              <FeatureCard key={index} {...feature} />
            ))}
          </div>
        </div>
      </section>

      {/* How It Works Section */}
      <section className="py-20 relative">
        <div className="container px-4 mx-auto">
          <div className="text-center max-w-3xl mx-auto mb-16">
            <motion.h2
              className="text-3xl md:text-4xl font-bold mb-4 dark:text-white"
              initial={{ opacity: 0, y: 20 }}
              whileInView={{ opacity: 1, y: 0 }}
              transition={{ duration: 0.5 }}
              viewport={{ once: true }}
            >
              How It <span className="text-[#4CAF50]">Works</span>
            </motion.h2>
            <motion.p
              className="text-xl text-muted-foreground dark:text-neutral-300"
              initial={{ opacity: 0, y: 20 }}
              whileInView={{ opacity: 1, y: 0 }}
              transition={{ duration: 0.5, delay: 0.2 }}
              viewport={{ once: true }}
            >
              Get started with Kalpi quant research platform in just a few simple steps
            </motion.p>
          </div>

          <div className="grid grid-cols-1 md:grid-cols-3 gap-8 relative">
            {/* Connecting line */}
            <div className="hidden md:block absolute top-1/2 left-0 right-0 h-0.5 bg-[#4CAF50]/30 -translate-y-1/2 z-0" />

            {workflowSteps.map((item, index) => (
              <motion.div
                key={index}
                className="relative z-10 bg-white/80 dark:bg-neutral-900/80 backdrop-blur-sm p-6 rounded-xl shadow-lg border border-gray-100 dark:border-neutral-800"
                initial={{ opacity: 0, y: 30 }}
                whileInView={{ opacity: 1, y: 0 }}
                transition={{ duration: 0.5, delay: index * 0.2 }}
                viewport={{ once: true }}
              >
                <div className="flex flex-col items-center text-center">
                  <div className="w-12 h-12 rounded-full bg-[#4CAF50] text-white flex items-center justify-center font-bold text-xl mb-4">
                    {item.step}
                  </div>
                  <h3 className="text-xl font-semibold mb-3 dark:text-white">{item.title}</h3>
                  <p className="text-muted-foreground dark:text-neutral-400">{item.description}</p>
                </div>
              </motion.div>
            ))}
          </div>
        </div>
      </section>
      
      {/* CTA Section */}
      <section className="py-20 bg-gradient-to-r from-[#4CAF50] to-[#3d8b40] relative overflow-hidden">
        <div className="container px-4 mx-auto">
          <motion.div
            className="max-w-4xl mx-auto text-center text-white"
            initial={{ opacity: 0, y: 20 }}
            whileInView={{ opacity: 1, y: 0 }}
            transition={{ duration: 0.5 }}
            viewport={{ once: true }}
          >
            <h2 className="text-3xl md:text-4xl font-bold mb-6">Ready for future of Investing?</h2>
            <p className="text-xl mb-8 text-white/80">
            Join thousands of investors who are already using Kalpi Capital to build Quant portfolios.
            </p>
            <div className="flex flex-col sm:flex-row gap-4 justify-center">
              <Button size="lg" className="bg-white text-[#4CAF50] hover:bg-white/90">
                Start Free Trial
              </Button>
              <Button size="lg" className="bg-transparent text-white border border-white hover:bg-white/10">
                Schedule Demo
              </Button>
            </div>
          </motion.div>
        </div>
      </section>
    </div>
  )
}