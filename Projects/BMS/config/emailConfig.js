const nodemailer = require("nodemailer");

const transporter = nodemailer.createTransport({
  host: "smtp.sendgrid.net",
  port: 587,
  auth: {
    user: "apikey", // Don't change this
    pass: process.env.SENDGRID_API_KEY,
  },
});

module.exports = transporter;
