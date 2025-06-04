import React, { use, useEffect } from "react";
import { useState } from "react";

function GetData() {
    const [data, setData] = useState([]);
    const [load, setLoad] = useState(true);
    const [err, setErr] = useState(false);

    async function fetchData() {
        fetch("https://jsonplaceholder.typicode.com/users/1")
        .then(res => res.json())
        .then(data => setData(data))
        .catch(err => setErr(true))
        .finally(() => setLoad(false))
    }

    useEffect(() => {
        fetchData();
    },[]);
    return (
        <>
          {load ? (
            <h2>Loading data…</h2>
          ) : err ? (
            <h2>Error fetching data</h2>
          ) : (
            <>
              <h2>Name: {data.name}</h2>
              <h2>Email: {data.email}</h2>
              <h2>Username: {data.username}</h2>
            </>
          )}
        </>
      );
    }
    
    export default GetData;