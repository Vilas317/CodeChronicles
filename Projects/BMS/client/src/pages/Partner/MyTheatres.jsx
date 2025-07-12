import React, { useEffect, useState } from "react";
import { Table, message } from "antd";
import TheatreForm from "../../components/TheatreForm";
import { useDispatch, useSelector } from "react-redux";
import { SetTheatres } from "../../redux/theatreSlice";
import axios from "axios";

function MyTheatres() {
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [selectedTheatre, setSelectedTheatre] = useState(null);
  const dispatch = useDispatch();
  const { theatres } = useSelector((state) => state.theatres);

  const fetchTheatres = async () => {
    try {
      const response = await axios.get("/api/theatres/by-owner", {
        headers: {
          Authorization: `Bearer ${localStorage.getItem("token")}`,
        },
      });
      dispatch(SetTheatres(response.data));
    } catch (error) {
      message.error("Failed to fetch theatres");
    }
  };

  const handleSubmit = async (values) => {
    try {
      if (selectedTheatre) {
        await axios.put(`/api/theatres/${selectedTheatre._id}`, values, {
          headers: { Authorization: `Bearer ${localStorage.getItem("token")}` },
        });
        message.success("Theatre updated");
      } else {
        await axios.post("/api/theatres", values, {
          headers: { Authorization: `Bearer ${localStorage.getItem("token")}` },
        });
        message.success("Theatre added");
      }
      fetchTheatres();
      setIsModalOpen(false);
    } catch (error) {
      message.error("Something went wrong");
    }
  };

  useEffect(() => {
    fetchTheatres();
  }, []);

  const columns = [
    { title: "Name", dataIndex: "name" },
    { title: "Email", dataIndex: "email" },
    { title: "Phone", dataIndex: "phone" },
    { title: "Address", dataIndex: "address" },
    {
      title: "Actions",
      render: (record) => (
        <button
          className="text-blue-500 underline"
          onClick={() => {
            setSelectedTheatre(record);
            setIsModalOpen(true);
          }}
        >
          Edit
        </button>
      ),
    },
  ];

  return (
    <div>
      <div className="flex justify-end mb-2">
        <button
          className="bg-primary text-white p-2"
          onClick={() => {
            setSelectedTheatre(null);
            setIsModalOpen(true);
          }}
        >
          Add Theatre
        </button>
      </div>

      <Table dataSource={theatres} columns={columns} rowKey="_id" />
      {isModalOpen && (
        <TheatreForm
          isModalOpen={isModalOpen}
          setIsModalOpen={setIsModalOpen}
          handleSubmit={handleSubmit}
          initialValues={selectedTheatre}
        />
      )}
    </div>
  );
}

export default MyTheatres;

