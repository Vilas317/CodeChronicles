import { useEffect, useState } from "react";
import axios from "axios";

function Home() {
  const [tasks, setTasks] = useState([]);
  const [text, setText] = useState("");

  const fetchTasks = async () => {
    const res = await axios.get("http://localhost:5000/api/tasks")
    setTasks(res.data);
  };

  const addTask = async () => {
    if (text.trim() === "") return;
    await axios.post("http://localhost:5000/api/tasks", { title: text });
    setText("");
    fetchTasks();
  };

  const deleteTask = async (id) => {
    await axios.delete(`http://localhost:5000/api/tasks/${id}`);
    fetchTasks();
  };

  const toggleComplete = async (task) => {
    await axios.put(`http://localhost:5000/api/tasks/${task._id}`, {
      completed: !task.completed,
    });
    fetchTasks();
  };

  useEffect(() => {
    fetchTasks();
  }, []);

  return (
    <div style={{ padding: "20px" }}>
      <h2>📝 Task Manager</h2>
      <input
        value={text}
        onChange={(e) => setText(e.target.value)}
        placeholder="New task"
      />
      <button onClick={addTask}>Add Task</button>

      <ul>
        {tasks.map((task) => (
          <li key={task._id} style={{ marginTop: 10 }}>
            <span
              style={{
                textDecoration: task.completed ? "line-through" : "none",
                cursor: "pointer",
              }}
              onClick={() => toggleComplete(task)}
            >
              {task.title}
            </span>
            <button
              onClick={() => deleteTask(task._id)}
              style={{ marginLeft: 10 }}
            >
              🗑
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Home;
