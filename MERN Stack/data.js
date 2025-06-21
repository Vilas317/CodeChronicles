// 1. ✅ Ek file data.txt banao aur usme "Welcome to Node.js" likho.
// 2. ✅ Us file ko read karo aur console me print karo.

const { doesNotMatch } = require('assert');
const fs = require('fs');
const { workerData } = require('worker_threads');

fs.writeFile('data.txt', 'Welcome to Node.js', 'utf8', (err) => {
    if (err) console.error(err);
    else console.log('File written');
  });
  