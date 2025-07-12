// src/components/TheatreForm.jsx
import React from "react";
import { Modal, Form, Input } from "antd";

function TheatreForm({ isModalOpen, setIsModalOpen, handleSubmit, initialValues }) {
  const [form] = Form.useForm();

  return (
    <Modal
      open={isModalOpen}
      title={initialValues ? "Edit Theatre" : "Add Theatre"}
      onCancel={() => setIsModalOpen(false)}
      onOk={() => {
        form.submit();
      }}
    >
      <Form
        form={form}
        layout="vertical"
        onFinish={handleSubmit}
        initialValues={initialValues || {}}
      >
        <Form.Item label="Name" name="name" rules={[{ required: true }]}>
          <Input />
        </Form.Item>
        <Form.Item label="Address" name="address" rules={[{ required: true }]}>
          <Input />
        </Form.Item>
        <Form.Item label="Phone" name="phone" rules={[{ required: true }]}>
          <Input />
        </Form.Item>
        <Form.Item label="Email" name="email" rules={[{ required: true }]}>
          <Input />
        </Form.Item>
      </Form>
    </Modal>
  );
}

export default TheatreForm;
