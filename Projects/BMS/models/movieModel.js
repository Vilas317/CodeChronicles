const mongoose = require("mongoose");

const movieSchema = new mongoose.Schema({
  title: { type: String, required: true },
  description: { type: String },
  duration: { type: Number },
  language: { type: String },
  releaseDate: { type: Date },
  genre: { type: String },
  poster: { type: String },
}, { timestamps: true });

const Movie = mongoose.model("Movie", movieSchema);
module.exports = Movie;
