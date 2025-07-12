const express = require("express");
const router = express.Router();
const authMiddleware = require("../middlewares/authMiddleware");
const {
  addShow,
  getAllShowsByTheatre,
  getAllTheatresByMovieAndDate,
} = require("../controllers/showController");

router.post("/add-show", authMiddleware, addShow);
router.get("/get-shows-by-theatre/:theatreId", authMiddleware, getAllShowsByTheatre);
router.get("/get-all-theatres-by-movie/:movie/:date", getAllTheatresByMovieAndDate);

module.exports = router;
