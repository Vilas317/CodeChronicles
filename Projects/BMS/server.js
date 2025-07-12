const express = require("express");
const mongoose = require("mongoose");
const dotenv = require("dotenv");
const path = require("path");
const app = express();

// Load env variables
dotenv.config();

// Middleware
app.use(express.json());

// Security middlewares
const limiter = require("./middlewares/rateLimiter");
const secureHeaders = require("./middlewares/securityHeaders");
app.use(limiter);
app.use(secureHeaders);

// Routes
const authRoutes = require("./routes/authRoutes");
const emailRoutes = require("./routes/emailRoutes");

app.use("/api/auth", authRoutes);
app.use("/api/email", emailRoutes);

// Serve frontend
app.use(express.static(path.join(__dirname, "./client/build")));

app.get("*", (req, res) => {
  res.sendFile(path.join(__dirname, "./client/build/index.html"));
});

// Connect DB and start server
mongoose
  .connect(process.env.MONGO_URL)
  .then(() => {
    const PORT = process.env.PORT || 5000;
    app.listen(PORT, () => console.log(`Server running on port ${PORT}`));
  })
  .catch((err) => console.log("MongoDB Connection Error", err));

// const express = require("express");
// const app = express();

// // ⛳ Important: Required for environment variables
// require("dotenv").config();

// // 👇 Mongoose DB connection
// const connectDB = require("./config/db");
// connectDB();

// // 👇 Middlewares
// app.use(express.json());

// // ✅ Ye line honi chahiye
// const userRoutes = require("./routes/userRoute");
// app.use("/api/user", userRoutes); // This line connects the route

// // ✅ Start server
// const PORT = process.env.PORT || 8080;
// app.listen(PORT, () => {
//   console.log(`🚀 Server running on port ${PORT}`);
// });
