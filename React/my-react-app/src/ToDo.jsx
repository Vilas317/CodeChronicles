// Q1. Create Todo Application

// You are tasked with creating a simple Todo application using React. The application should allow users to add tasks to a list and delete them by clicking on them. The main functionalities you need to implement are adding new tasks and deleting existing tasks from the list.

// Functional Requirements
// Adding Tasks:

// Implement an input field where users can type in new tasks.
// Include an "Add Task" button that, when clicked, adds the task from the input field to the list of tasks.
// Clear the input field after adding a task.
// Displaying Tasks:

// Render a list that displays all added tasks.
// Each task in the list should be clickable.
// Deleting Tasks:

// Implement functionality to delete a task from the list when it is clicked.
// Technical Requirements
// Utilize functional components and React hooks for state management.
// Break down the application into at least three components: Todo, InputBox, and List.

import React, { useState } from "react";
import List from "./List";
import InputBox from "./inputBox";

function ToDo() {
    const[taskArr, setTasks] = useState([]);
    const addTask = (InputValue) => {
        setTasks(prev => [...prev, inputValue]);
    };

    const handleDelete = (idx) => {
        setTasks(prev => prev.filter(_, index !== idex));
    };

    return (
        <>
        <InputBox addTask={addTask} />
        <List tasksArr={tasksArr} handleDelete={handleDelete}></List>
      </>
    );
  }

export default ToDo;