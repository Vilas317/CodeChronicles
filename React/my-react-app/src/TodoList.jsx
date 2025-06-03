// src/assets/TodoList.jsx
import React, { useState } from 'react';

function TodoList() {
  const initialTodos = ['Shopping', 'Car Washing', 'Cleaning'];
  const [doneItems, setDoneItems] = useState([]);

  const markDone = (index) => {
    setDoneItems((prev) =>
      prev.includes(index)
        ? prev.filter((i) => i !== index)
        : [...prev, index]
    );
  };

  return (
    <div>
      <h2>My Todo List</h2>
      <ul>
        {initialTodos.map((item, index) => (
          <li key={index}>
            <span style={{ textDecoration: doneItems.includes(index) ? 'line-through' : 'none' }}>
              {item}
            </span>
            <button onClick={() => markDone(index)}>
              {doneItems.includes(index) ? 'Undo' : 'Mark Done'}
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TodoList;
