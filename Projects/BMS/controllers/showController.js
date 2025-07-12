const Show = require("../models/showModel");
const Theatre = require("../models/theatreModel");

exports.addShow = async (req, res) => {
  try {
    const newShow = new Show(req.body);
    await newShow.save();
    res.send({ success: true, message: "Show added successfully", data: newShow });
  } catch (error) {
    res.status(500).send({ success: false, message: error.message });
  }
};

exports.getAllShowsByTheatre = async (req, res) => {
  try {
    const shows = await Show.find({ theatre: req.params.theatreId }).populate("movie");
    res.send({ success: true, message: "Shows fetched", data: shows });
  } catch (error) {
    res.status(500).send({ success: false, message: error.message });
  }
};

exports.getAllTheatresByMovieAndDate = async (req, res) => {
  try {
    const { movie, date } = req.params;
    const shows = await Show.find({ movie, date }).populate("theatre");
    let uniqueTheatres = [];

    shows.forEach((show) => {
      let isTheatre = uniqueTheatres.find(t => t._id.equals(show.theatre._id));
      if (!isTheatre) {
        let showsOfThisTheatre = shows.filter(s => s.theatre._id.equals(show.theatre._id));
        uniqueTheatres.push({ ...show.theatre._doc, shows: showsOfThisTheatre });
      }
    });

    res.send({ success: true, message: "All theatres fetched!", data: uniqueTheatres });
  } catch (error) {
    res.status(500).send({ success: false, message: error.message });
  }
};
