const express = requires("express");
const router = express.Router();
const { sendEmail } = requrie("../controllers/emailController");

router.post("/send", sendEmail);

module.exports = router;