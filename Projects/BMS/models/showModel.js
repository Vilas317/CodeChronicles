const mongoose = require("mongoose");

const showSchema = new mongoose.Schema({
  name: { type: String, required: true },
  theatre: { type: mongoose.Schema.Types.ObjectId, ref: "Theatre", required: true },
  movie: { type: mongoose.Schema.Types.ObjectId, ref: "Movie", required: true },
  date: { type: String, required: true },
  time: { type: String, required: true },
  totalSeats: { type: Number, required: true },
  bookedSeats: { type: Array, default: [] },
  ticketPrice: { type: Number, required: true }
}, {
  timestamps: true
});

module.exports = mongoose.model("Show", showSchema);
