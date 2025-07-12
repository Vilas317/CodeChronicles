const express = require("express");
const router = express.Router();
const { forgetPassword, resetPassword } = require("../controllers/authController");

router.post("/forget-password", forgetPassword);
router.post("/reset-password/:email", resetPassword);

module.exports = router;
