const sgMail = require("@sendgrid/mail");
const dotenv = require("dotenv");

dotenv.config();
sgMail.setApiKey(process.env.SENDGRID_API_KEY);

const sendEmail = async (req, res) => {
  const { to, subject, text, html } = req.body;

  try {
    const msg = {
      to,
      from: process.env.EMAIL_FROM, // verified sender in SendGrid
      subject,
      text,
      html,
    };

    await sgMail.send(msg);
    res.status(200).send({ success: true, message: "Email sent successfully" });
  } catch (error) {
    console.error("Email send error:", error);
    res.status(500).send({ success: false, message: "Email sending failed" });
  }
};

module.exports = { sendEmail };
