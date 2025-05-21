import type { Config } from "tailwindcss"

const config: Config = {
  darkMode: "class",
  content: [
    "./app/**/*.{ts,tsx}",
    "./components/**/*.{ts,tsx}",
  ],
  theme: {
    extend: {
      fontFamily: {
        sans: ["Inter", "sans-serif"],
      },
      colors: {
        kalpiGreen: "#4CAF50",
        kalpiDark: "#1F1F1F",
      },
    },
  },
  plugins: [],
}

export default config
