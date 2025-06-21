const User = require("../models/userModel");

const registerUser = async (req, res) => {
  try {
    const { name, email, password } = req.body;
    const userExists = await User.findOne({ email });
    if (userExists) return res.send({ success: false, message: "User already exists" });

    const newUser = new User({ name, email, password });
    await newUser.save();
    res.send({ success: true, message: "Registration Successful" });
  } catch (error) {
    res.status(500).send({ success: false, message: "Error in registration", error });
  }
};

module.exports = { registerUser };
