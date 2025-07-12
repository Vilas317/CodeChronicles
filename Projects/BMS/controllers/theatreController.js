const Theatre = require("../models/Theatre");

const addTheatre = async (req, res) => {
  try {
    const newTheatre = new Theatre({ ...req.body, owner: req.body.userId });
    await newTheatre.save();
    res.send({ success: true, message: "Theatre added successfully" });
  } catch (error) {
    res.status(500).send({ success: false, message: error.message });
  }
};

const getAllTheatres = async (req, res) => {
  try {
    const theatres = await Theatre.find().populate("owner", "name email");
    res.send({ success: true, data: theatres });
  } catch (error) {
    res.status(500).send({ success: false, message: error.message });
  }
};

const getPartnerTheatres = async (req, res) => {
  try {
    const theatres = await Theatre.find({ owner: req.body.userId });
    res.send({ success: true, data: theatres });
  } catch (error) {
    res.status(500).send({ success: false, message: error.message });
  }
};

const updateTheatre = async (req, res) => {
  try {
    await Theatre.findByIdAndUpdate(req.body._id, req.body);
    res.send({ success: true, message: "Theatre updated successfully" });
  } catch (error) {
    res.status(500).send({ success: false, message: error.message });
  }
};

const deleteTheatre = async (req, res) => {
  try {
    await Theatre.findByIdAndDelete(req.body._id);
    res.send({ success: true, message: "Theatre deleted successfully" });
  } catch (error) {
    res.status(500).send({ success: false, message: error.message });
  }
};

module.exports = {
  addTheatre,
  getAllTheatres,
  getPartnerTheatres,
  updateTheatre,
  deleteTheatre,
};
