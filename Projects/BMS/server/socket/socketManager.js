function handleSocket(socket, io) {
    // 👂 Listen for a message from client
    socket.on("send-message", (data) => {
      console.log("Received message:", data);
  
      // 📢 Broadcast to all clients except sender
      socket.broadcast.emit("receive-message", data);
    });
  
    // 🛑 When a client disconnects
    socket.on("disconnect", () => {
      console.log("User disconnected:", socket.id);
    });
  }
  
  module.exports = { handleSocket };
  