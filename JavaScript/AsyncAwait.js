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

function placeOrder(drink) {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        if (drink === 'coffee') {
          resolve("Order for Coffee Placed");
        } else {
          reject("Order cannot be Placed");
        }
      }, 2000);
    });
  }
  
  function serveOrder(order) {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        resolve(order + " and Served");
      }, 1500);
    });
  }
  
  async function processOrder() {
    try {
        let order = await placeOrder('coffee');
        console.log(order);

        let served = await serveOrder(order);
        console.log(served);
    } catch (err) {
        console.log("Error:", err);
      }
  }

processOrder();
  