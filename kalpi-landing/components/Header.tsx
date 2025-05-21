"use client"

import Image from "next/image"
import Link from "next/link"
import { Button } from "./ui/button"

export default function Header() {
  return (
    <header className="fixed top-0 left-0 right-0 z-50 bg-white/80 dark:bg-neutral-900/80 backdrop-blur-md shadow-sm">
      <div className="container mx-auto px-4 py-3 flex justify-between items-center">
        <Link href="/">
          <Image src="/images/kalpi_logo.jpeg" alt="Kalpi Logo" width={40} height={40} />
        </Link>
        <nav className="flex gap-6 items-center">
          <Link href="#about" className="text-sm">About</Link>
          <Link href="#solutions" className="text-sm">Solutions</Link>
          <Link href="#contact" className="text-sm">Contact</Link>
          <Button size="default">Get Started</Button>
        </nav>
      </div>
    </header>
  )
}
