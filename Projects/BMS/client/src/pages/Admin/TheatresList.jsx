import React, { useEffect } from "react";
import { Table, message, Switch } from "antd";
import { useDispatch, useSelector } from "react-redux";
import { SetTheatres } from "../../redux/theatreSlice";
import axios from "axios";

function TheatresList() {
  const dispatch = useDispatch();
  const { theatres } = useSelector((state) => state.theatres);

  const fetchTheatres = async () => {
    try {
      const response = await axios.get("/api/theatres", {
        headers: {
          Authorization: `Bearer ${localStorage.getItem("token")}`,
        },
      });
      dispatch(SetTheatres(response.data));
    } catch (error) {
      message.error("Failed to fetch theatres");
    }
  };

  const toggleActive = async (theatreId, isActive) => {
    try {
      await axios.put(
        `/api/theatres/${theatreId}/status`,
        { isActive },
        {
          headers: {
            Authorization: `Bearer ${localStorage.getItem("token")}`,
          },
        }
      );
      fetchTheatres();
    } catch (error) {
      message.error("Error updating status");
    }
  };

  useEffect(() => {
    fetchTheatres();
  }, []);

  const columns = [
    { title: "Name", dataIndex: "name" },
    { title: "Owner", dataIndex: "owner" },
    { title: "Email", dataIndex: "email" },
    {
      title: "Status",
      render: (record) => (
        <Switch
          checked={record.isActive}
          onChange={(checked) => toggleActive(record._id, checked)}
        />
      ),
    },
  ];

  return <Table dataSource={theatres} columns={columns} rowKey="_id" />;
}

export default TheatresList;
