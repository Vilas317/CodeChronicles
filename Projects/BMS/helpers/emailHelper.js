const fs = require("fs");
const path = require("path");
const sgMail = require("@sendgrid/mail");
sgMail.setApiKey(process.env.SENDGRID_API_KEY);

exports.replaceContent = async (templateName, creds) => {
  const filePath = path.join(__dirname, "../templates", templateName);
  let content = fs.readFileSync(filePath, "utf-8");
  Object.keys(creds).forEach(key => {
    const regex = new RegExp(`{{${key}}}`, "g");
    content = content.replace(regex, creds[key]);
  });
  return content;
};

exports.sendEmail = async (to, subject, html) => {
  const msg = {
    to,
    from: "noreply@bms.com",
    subject,
    html,
  };
  await sgMail.send(msg);
};
