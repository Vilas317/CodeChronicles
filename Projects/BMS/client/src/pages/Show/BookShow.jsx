import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { message, Button } from "antd";
import axios from "axios";

function BookShow() {
  const { showId } = useParams();
  const [show, setShow] = useState(null);

  const fetchShow = async () => {
    try {
      const res = await axios.get(`/api/shows/get-show/${showId}`);
      if (res.data.success) {
        setShow(res.data.data);
      }
    } catch (err) {
      message.error("Failed to fetch show");
    }
  };

  useEffect(() => {
    fetchShow();
  }, []);

  return (
    <div>
      {show ? (
        <div>
          <h2>{show.name}</h2>
          <p>{show.date} | {show.time}</p>
          <p>Price: ₹{show.ticketPrice}</p>
          <Button type="primary">Book Now</Button>
        </div>
      ) : (
        <p>Loading show...</p>
      )}
    </div>
  );
}

export default BookShow;
