// let a = { user: "Rahul", data: { age: 22 } };
// let b = a;
// b.data.age = 25;
// console.log(a.data.age); // ✅ Output: 25

// let original = { x: 10, y: { z: 20 } };
// let copy = JSON.parse(JSON.stringify(original));
// copy.y.z = 99;
// console.log(original.y.z); 

// Problem 3: customDeepCopy Function (Recursion Based)
// function customDeepCopy(obj) {
//     if (obj == null || typeof obj !== "object") {
//         return obj;
//     }
//     if (Array.isArray(obj)) {
//         return obj.map(item => customDeepCopy(item));
//     }
//     let copiedObj = {};
//     for (let key in obj) {
//         if (obj.hasOwnProperty(key)) {
//             copiedObj[key] = customDeepCopy(obj[key]);
//         }
//     }
//     return copiedObj;
// }

let obj = { name: "Alice", info: { age: 22 } };
let clone = { ...obj };
clone.info.age = 30;
console.log(obj.info.age); 
