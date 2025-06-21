const express = require("express");
const { register, login } = require("../controllers/userController");
const auth = require("../middlewares/authMiddleware");
const isAdmin = require("../middlewares/adminMiddleware");

const router = express.Router();

router.post("/register", register);
router.post("/login", login);

// Protected route
router.get("/profile", auth, (req, res) => {
  res.send({ message: "User profile", user: req.user });
});

// Admin-only route
router.get("/admin-data", auth, isAdmin, (req, res) => {
  res.send({ message: "Admin data only" });
});

module.exports = router;
