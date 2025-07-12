const User = require("../models/userModel");
const emailHelper = require("../utils/emailHelper");
const bcrypt = require("bcrypt");

exports.forgetPassword = async (req, res) => {
  const { email } = req.body;
  const user = await User.findOne({ email });

  if (!user) return res.status(404).send({ message: "User not found" });

  const otp = Math.floor(100000 + Math.random() * 900000).toString();
  user.otp = otp;
  user.otpExpiry = Date.now() + 10 * 60 * 1000; // 10 min
  await user.save();

  const content = await emailHelper.replaceContent("otp-template.html", {
    name: user.name,
    otp,
  });

  await emailHelper.sendEmail(email, "Your OTP", content);
  res.send({ message: "OTP sent to your email" });
};

exports.resetPassword = async (req, res) => {
  const { email } = req.params;
  const { otp, newPassword } = req.body;
  const user = await User.findOne({ email });

  if (!user) return res.status(404).send({ message: "User not found" });
  if (user.otp !== otp || user.otpExpiry < Date.now()) {
    return res.status(400).send({ message: "Invalid or expired OTP" });
  }

  user.password = await bcrypt.hash(newPassword, 10);
  user.otp = undefined;
  user.otpExpiry = undefined;
  await user.save();

  res.send({ message: "Password reset successful" });
};
