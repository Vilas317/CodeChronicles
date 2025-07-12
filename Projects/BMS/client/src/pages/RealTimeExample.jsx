import React, { useEffect, useState } from "react";
import socket from "../socket";

const RealTimeExample = () => {
  const [msg, setMsg] = useState("");
  const [incoming, setIncoming] = useState("");

  useEffect(() => {
    socket.on("receive-message", (data) => {
      setIncoming(data);
    });
  }, []);

  const sendMessage = () => {
    socket.emit("send-message", msg);
    setMsg("");
  };

  return (
    <div>
      <h2>WebSocket Chat</h2>
      <input value={msg} onChange={(e) => setMsg(e.target.value)} />
      <button onClick={sendMessage}>Send</button>
      <p><strong>Incoming Message:</strong> {incoming}</p>
    </div>
  );
};

export default RealTimeExample;
