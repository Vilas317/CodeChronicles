import React from "react";
import { Form, Input, Button, DatePicker, TimePicker } from "antd";

function ShowForm({ onFinish, initialValues }) {
  const [form] = Form.useForm();

  return (
    <Form form={form} layout="vertical" onFinish={onFinish} initialValues={initialValues}>
      <Form.Item name="name" label="Show Name" rules={[{ required: true }]}>
        <Input />
      </Form.Item>
      <Form.Item name="movie" label="Movie ID" rules={[{ required: true }]}>
        <Input />
      </Form.Item>
      <Form.Item name="date" label="Date" rules={[{ required: true }]}>
        <DatePicker />
      </Form.Item>
      <Form.Item name="time" label="Time" rules={[{ required: true }]}>
        <TimePicker format="HH:mm" />
      </Form.Item>
      <Form.Item name="ticketPrice" label="Ticket Price" rules={[{ required: true }]}>
        <Input type="number" />
      </Form.Item>
      <Form.Item name="totalSeats" label="Total Seats" rules={[{ required: true }]}>
        <Input type="number" />
      </Form.Item>
      <Button htmlType="submit" type="primary">Submit</Button>
    </Form>
  );
}

export default ShowForm;
