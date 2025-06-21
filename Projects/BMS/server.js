const express = require("express");
const dotenv = require("dotenv");
const cors = require("cors");
const connectDB = require("./config/db");

dotenv.config();
connectDB();

const app = express();
app.use(cors());
app.use(express.json());

app.use("/api/users", require("./routes/userRoutes"));

app.listen(process.env.PORT, () => {
  console.log(`🚀 Server running on port ${process.env.PORT}`);
});
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
