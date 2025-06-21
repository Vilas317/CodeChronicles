const jwt = require("jsonwebtoken");

module.exports = (req, res, next) => {
  try {
    const token = req.headers["authorization"].split(" ")[1];
    const decoded = jwt.verify(token, process.env.JWT_SECRET);
    req.user = decoded; // attach user to req
    next();
  } catch (err) {
    res.status(401).send({ message: "Unauthorized" });
  }
};
