import { cn } from "@/lib/utils"
import { ButtonHTMLAttributes, forwardRef } from "react"

interface ButtonProps extends ButtonHTMLAttributes<HTMLButtonElement> {
  variant?: "default" | "outline"
  size?: "default" | "lg"
}

export const Button = forwardRef<HTMLButtonElement, ButtonProps>(
  ({ className, variant = "default", size = "default", ...props }, ref) => {
    const base = "inline-flex items-center justify-center rounded-xl font-medium transition-colors focus:outline-none"
    const sizes = {
      default: "px-4 py-2 text-sm",
      lg: "px-6 py-3 text-base"
    }
    const variants = {
      default: "bg-[#4CAF50] text-white hover:bg-[#3d8b40]",
      outline: "border border-[#4CAF50] text-[#4CAF50] hover:bg-[#4CAF50]/10"
    }

    return (
      <button
        ref={ref}
        className={cn(base, sizes[size], variants[variant], className)}
        {...props}
      />
    )
  }
)

Button.displayName = "Button"
