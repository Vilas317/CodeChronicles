const express = require("express");
const http = require("http");
const { Server } = require("socket.io");
const cors = require("cors");
const dotenv = require("dotenv");
const connectDB = require("./config/db");
const { handleSocket } = require("./socket/socketManager");

dotenv.config();
connectDB();

const app = express();
app.use(cors());
app.use(express.json());

// 👇 Example route
app.get("/", (req, res) => {
  res.send("Server Running...");
});

// 🔌 Create HTTP server and attach socket.io
const server = http.createServer(app);
const io = new Server(server, {
  cors: {
    origin: "*",
  },
});

// 🎯 Handle socket connections
io.on("connection", (socket) => {
  console.log("User connected:", socket.id);
  handleSocket(socket, io); // your logic here
});

const PORT = process.env.PORT || 5000;
server.listen(PORT, () => {
  console.log(`🚀 Server running on port ${PORT}`);
});
