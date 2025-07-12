const express = require("express");
const router = express.Router();
const auth = require("../middlewares/authMiddleware");
const isAdmin = require("../middlewares/adminMiddleware");
const {
  addTheatre,
  getAllTheatres,
  getPartnerTheatres,
  updateTheatre,
  deleteTheatre,
} = require("../controllers/theatreController");

router.post("/add", auth, addTheatre);

router.get("/partner", auth, getPartnerTheatres);

router.get("/admin", auth, isAdmin, getAllTheatres);

router.put("/update", auth, updateTheatre);

router.delete("/delete", auth, deleteTheatre);

module.exports = router;
