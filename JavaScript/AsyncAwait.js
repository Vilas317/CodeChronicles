/* Problem 1: Simulating a Simple Network Request
Problem:
Ek network request ka simulation karo jisme ek asynchronous function ho jo 2 seconds baad data return kare, aur tumhe async/await ka use karte hue data ko fetch karke console me print karna ho.*/

// function fetchData() {
//     return new Promise((resolve, reject) => {
//       setTimeout(() => {
//         resolve("Data fetched successfully");
//       }, 2000); // 2 seconds ke baad resolve hoga
//     });
//   }

//   async function getData() {
//     try {

//       let data = await fetchData(); 
//       console.log(data); 
//     } catch (err) {
//       console.log("Error:", err);
//     }
//   }

//   getData();

/*Problem 2: Handling Errors in Async Functions
Problem:
Ek function getUser banao jo 3 seconds baad user data fetch kare, aur agar koi error aata hai (jaise, agar user na mile), toh error handle karna ho.*/

// function getUser() {
//     return new Promise((resolve, reject) => {
//       setTimeout(() => {
//         const errorOccured = true; // Simulate an error
//         if (errorOccured) {
//           reject("User not found");
//         } else {
//           resolve("User data fetched successfully");
//         }
//       }, 3000);
//     });
//   }

//   async function fetchUser() {
//     try {
//         let user = await getUser();
//         console.log("User data fetched successfully");
//     } catch (err) {
//     console.log("User not found", err)
//     }
// }

// fetchUser();

/*Problem 3: Multiple Async Calls and Error Handling
Problem:
Do async functions banao:

placeOrder(drink) jo ek order place kare aur ek promise return kare.

serveOrder(order) jo order ko serve kare.

async/await ka use karo, aur agar koi function fail ho toh usko catch karo.*/

// function placeOrder(drink) {
//     return new Promise((resolve, reject) => {
//       setTimeout(() => {
//         if (drink === 'coffee') {
//           resolve("Order for Coffee Placed");
//         } else {
//           reject("Order cannot be Placed");
//         }
//       }, 2000);
//     });
//   }

//   function serveOrder(order) {
//     return new Promise((resolve, reject) => {
//       setTimeout(() => {
//         resolve(order + " and Served");
//       }, 1500);
//     });
//   }

//   async function processOrder() {
//     try {
//         let order = await placeOrder('coffee');
//         console.log(order);

//         let served = await serveOrder(order);
//         console.log(served);
//     } catch (err) {
//         console.log("Error:", err);
//       }
//   }

// processOrder();

/* Problem 4: Sequential Execution of Multiple Async Calls
Problem:
Teen async functions create karo, jisme pehla function order place karega, doosra order ko serve karega, aur teesra bill generate karega. Use async/await to handle them in sequence.*/

// function placeOrder(drink) {
//   return new Promise((resolve) => {
//     setTimeout(() => {
//       resolve(`${drink} order placed`);
//     }, 1000);
//   });
// }

// function serveOrder(order) {
//   return new Promise((resolve) => {
//     setTimeout(() => {
//       resolve(`${order} and Served`);
//     }, 2000);
//   });
// }

// function generateBill(order) {
//   return new Promise((resolve) => {
//     setTimeout(() => {
//       resolve(`${order} and Bill generated`);
//     }, 1500);
//   });
// }

// async function processOrder() {
//   try {
//     let order = await placeOrder('Coffee');
//     console.log(order);

//     let served = await serveOrder(order);
//     console.log(served);

//     let bill = await generateBill(served);
//     console.log(bill);
//   } catch (err) {
//     console.log("Error:", err);
//   }
// }
// processOrder();

/*  Problem 5: Simulate a Database Query with Error Handling
Problem:
Simulate a database query that may fail. Tumhe async/await ka use karke query result fetch karna hai, aur agar query fail ho jaaye toh error handle karna hai.*/

// function queryDatabase(query) {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       if (query === "SELECT * FROM users") {
//         resolve("Database Query Successful");
//       } else {
//         reject("Database Query Failed");
//       }
//     }, 2500);
//   });
// }

// async function runQuery() {
//   try {
//     let query = await queryDatabase("Database Query Successful");
//     console.log(query);
//   } catch (err) {
//     console.log("Error:", err);
//   }
// }
// runQuery();

/*🔧 Problem: Simulate a Step-by-Step Signup Process Using Callbacks
Tumhe ek signup() function banana hai jo 3 steps asynchronous way mein perform kare (using setTimeout):

📤 Send OTP

✅ Verify OTP

🧑‍💻 Create User Profile

Each step should take 1 second (1000 ms) and should log a message when complete.

Lekin ye sab steps ek ke baad ek hone chahiye — jaise real signup flow.*/

// console.log("Start");
// setTimeout(() => {
// console.log("Sending OTP...");
// setTimeout(() => {
// console.log("OTP Verified...");
// setTimeout(() => {
// console.log("User Profile Created!");
// }, 1000);
// }, 1000);
// }, 1000);
// console.log("End");

/* Ab karte hain thoda improvement — callback hell ko avoid karne ke liye function abstraction ka use karte hain.
Same flow, but functions mein break karke likho 👇*/

// console.log("Start");
// setTimeout(() => {
// console.log("Sending OTP...");
// setTimeout(() => {
// console.log("OTP Verified...");
// setTimeout(() => {
// console.log("User Profile Created!");
// }, 1000);
// }, 1000);
// }, 1000);
// console.log("End");

/* ✅ 💻 Practice Question 2: Register → Login → Fetch Dashboard
Tumhe teen kaam karne hain sequentially using callbacks:

registerUser → "User Registered"

loginUser → "User Logged In"

getUserDashboard → "Dashboard Data Fetched"

Sabka delay 1 second hoga using setTimeout()
Aur tumhe callback hell style mein likhna hai — jaise nested setTimeout() hota hai.*/

// console.log("Start");
// setTimeout(() => {
// console.log("User Registered");
// setTimeout(() => {
// console.log("User Logged In");
// setTimeout(() => {
// console.log("Dashboard Data Fetched");
// console.log("End");
// }, 1000);
// }, 1000);
// }, 1000);

/*🔧 🧪 Problem: Simulate Online Food Ordering System
Tumhe ek food ordering system ka flow banana hai:

👨‍🍳 Order Placed

🧑‍🍳 Food is being prepared

🛵 Out for Delivery

🏠 Delivered

Sab kuch setTimeout() aur callback chaining (callback hell) se likhna hai.*/

/*console.log("Start");
setTimeout(() => {
console.log("Order Placed");
setTimeout(() => {
console.log("Food is being prepared");
setTimeout(() => {
console.log("Out for Delivery");
setTimeout(() => {
console.log("Order Delivered!");
console.log("End");
}, 1000);
}, 1000);
}, 1000);
}, 1000);*/

/*🔹Q1. Ek promise banao jo 2 second ke baad "Data Loaded!" resolve kare.*/
// let loadData = new Promise(function(resolve, reject) {
//     setTimeout(() => {
//         resolve("Data Loaded!");
//     }, 2000);
// });

// loadData.then((msg) => {
//     console.log(msg);
// });

// 🔹Q2. Ek promise banao jo randomly resolve ya reject kare after 1 sec.

// let randomCheck = new Promise(function(resolve, reject) {
//     setTimeout(() => {
//         if(Math.random() > 0.5) {
//             resolve("Success!");
//         } else {
//             reject("Failed!");
//         }
//     }, 1000);
// });

// randomCheck
// .then((msg) => console.log(msg))
// .catch((err) => console.log(err))
// .finally(() => console.log("check done"))

/* Practice Problem 1: Delayed Hello
👉 Write a function delayedHello() that returns a promise. It should resolve with the message "Hello after 2 seconds" after 2 seconds. */
// function delayedHello() {
//     return new Promise(function (resolve, reject) {
//         setTimeout(() => {
//             resolve("Hello after 2 seconds");
//         }, 2000);
//     });
// }
// delayedHello().then((msg) => {
//     console.log(msg);
// });

/*Practice Problem 2: Promise Chaining with delayedHello
Use delayedHello() function ko chain karo is tarah ki:

Pehle delayedHello() call karo,

Fir uske baad .then() me ek aisa message print karo: "Now chaining works!"*/

// function delayedHello() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             resolve("Hello after 2 seconds");
//         }, 2000);
//     });
// }

// function chaining() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             resolve("Now chaining works!");
//         }, 1000);
//     });
// }

// delayedHello()
//   .then((msg) => {
//     console.log(msg);
//     return chaining();
//   })
//   .then((msg) => {
//     console.log(msg);
//   });
