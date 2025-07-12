const express = require("express");
const { addMovie, getAllMovies, updateMovie, deleteMovie } = require("../controllers/movieController");
const auth = require("../middlewares/authMiddleware");
const isAdmin = require("../middlewares/adminMiddleware");

const router = express.Router();

router.post("/add-movie", auth, isAdmin, addMovie);
router.get("/get-all-movies", auth, getAllMovies);
router.put("/update-movie", auth, isAdmin, updateMovie);
router.delete("/delete-movie", auth, isAdmin, deleteMovie);

module.exports = router;
