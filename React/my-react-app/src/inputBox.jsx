import React, { useState } from "react";

function InputBox(props) {
    const [val, setVal] = useState("");
    const handleInput = (e) => {
        setInterval(e.target.value)
    };
    const addTaskChild = () => {
        props.addTask(val);
        setVal("");
    };
    return (
        <div className="inputBox">
            <input type="text" value={val} onChange = {handleInput}/>
            <button onClick={addTaskChild}>Add Task</button>
        </div>
    );
}

export default InputBox;