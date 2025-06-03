// Q1. Basic Counter with Hooks

// You are tasked with implementing a basic counter application using React. Your application should allow users to increment and decrement a count value displayed on the screen. The initial value of the count should be 0.

// Instructions

// Create a React component named Counter.
// Use the useState hook to manage the count state within the Counter component. The initial count should be set to 0.
// Implement two functions within the Counter component:
// increment: When called, this function should increase the count by 1.
// decrement: When called, this function should decrease the count by 1.
// Render two buttons within the Counter component:
// One button for incrementing the count. This button should have the text +.
// One button for decrementing the count. This button should have the text -.
// Display the current count value between these two buttons.

import React, {useState} from "react";

// Complete the code
function Counter() {
  const [count, setCount] = useState(0);
  const increment = () => {
    setCount(count + 1);
  };
  const decrement = () => {
    setCount(count - 1);
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <button onClick={decrement} style={{ fontSize: "20px" }}>-</button>
      <span style={{ margin: "0 20px", fontSize: "24px" }}>{count}</span>
      <button onClick={increment} style={{ fontSize: "20px" }}>+</button>
    </div>
  );
}

export default Counter;

