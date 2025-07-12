const Movie = require("../models/movieModel");

// Add Movie
exports.addMovie = async (req, res) => {
  try {
    const newMovie = new Movie(req.body);
    await newMovie.save();
    res.send({ success: true, message: "Movie added successfully" });
  } catch (error) {
    res.send({ success: false, message: error.message });
  }
};

// Get All Movies
exports.getAllMovies = async (req, res) => {
  try {
    const movies = await Movie.find();
    res.send({ success: true, data: movies });
  } catch (error) {
    res.send({ success: false, message: error.message });
  }
};

// Update Movie
exports.updateMovie = async (req, res) => {
  try {
    await Movie.findByIdAndUpdate(req.body._id, req.body);
    res.send({ success: true, message: "Movie updated successfully" });
  } catch (error) {
    res.send({ success: false, message: error.message });
  }
};

// Delete Movie
exports.deleteMovie = async (req, res) => {
  try {
    await Movie.findByIdAndDelete(req.body._id);
    res.send({ success: true, message: "Movie deleted successfully" });
  } catch (error) {
    res.send({ success: false, message: error.message });
  }
};
