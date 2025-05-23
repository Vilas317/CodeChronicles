// Problem 1: Reuse greet function with different objects using .call
// Function.prototype.myCall = function(context, ...args) {
//     context = context || globalThis;
//     const fnSymbol = Symbol("fn");
//     context[fnSymbol] = this;
//     const result = context[fnSymbol](...args);
//     delete context[fnSymbol];
//     return result;
//   };
  
//   const greet = function (place) {
//     console.log(`${this.name} from ${place}`);
//   };
  
//   const user1 = { name: "Amit" };
//   const user2 = { name: "Sara" };
  
//   greet.myCall(user1, "Delhi");   
//   greet.myCall(user2, "Mumbai");  

// 🔹 Problem 2: Use .apply to borrow a method
// Function.prototype.myApply = function(context, args = []) {
//     context = context || globalThis;
//     const fnSymbol = Symbol("fn");
//     context[fnSymbol] = this;
//     const result = context[fnSymbol](...args);
//     delete context[fnSymbol];
//     return result;
//   };
  
//   const user = {
//     name: "John",
//     showDetails(age) {
//       console.log(`${this.name}, Age: ${age}`);
//     }
//   };
  
//   const anotherUser = { name: "Neha" };
  
//   user.showDetails.myApply(anotherUser, [28]);
   
// 🔹 Problem 3: Use .bind to fix this inside a setTimeout
// Function.prototype.myBind = function(context, ...args1) {
//     const fn = this;
//     return function(...args2) {
//       return fn.apply(context, [...args1, ...args2]);
//     };
//   };
  
//   const person = {
//     name: "Nikita",
//     greet() {
//       setTimeout(function () {
//         console.log("Hi " + this.name);
//       }.myBind(this), 1000);  // using custom bind
//     },
//   };
  
//   person.greet();

// Problem 1: Implement myMap and use it to square numbers
// Array.prototype.myMap = function(callback) {
//   let result = [];
//   for (let i = 0; i < this.length; i++) {
//     result.push(callback(this[i], i, this));
//   }
//   return result;
// };

// const numbers = [1, 2, 3];
// const squared = numbers.myMap(n => n * n);
// console.log(squared);

// Problem 2: Use myFilter to get words with length > 3
// Array.prototype.myFilter = function(callback) {
//   let result = [];
//   for (let i = 0; i < this.length; i++) {
//     if (callback(this[i], i, this)) {
//       result.push(this[i]);
//     }
//   }
//   return result;
// };

// const words = ["sun", "moon", "star", "sky"];
// const result = words.myFilter(word => word.length > 3);
// console.log(result);

// Problem 3: Use myReduce to find product of numbers
// Array.prototype.myReduce = function(callback, initialValue) {
//   let accumulator = initialValue || this[0];
//   let start = initialValue ? 0 : 1;

//   for (let i = start; i < this.length; i++) {
//     accumulator = callback(accumulator, this[i], i, this);
//   }
//   return accumulator;
// };

// const nums = [2, 3, 4];
// const product = nums.myReduce((acc, num) => acc * num, 1);
// console.log(product);

// Challenge 1: myEvery polyfill banao
// Array.prototype.myEvery = function(callback) {
//   for (let i = 0; i < this.length; i++) {
//     if (!callback(this[i], i, this)) return false;
//   }
//   return true;
// };

// const arr = [2, 4, 6];
// const allEven = arr.myEvery(n => n % 2 === 0);

// Challenge 2: mySome polyfill banao
// Array.prototype.mySome = function(callback) {
//   for (let i = 0; i < this.length; i++) {
//     if (callback(this[i], i, this)) return true;
//   }
//   return false;
// };

// const arr = [1, 3, 5];
// const hasEven = arr.mySome(n => n % 2 === 0);

// 🔹 Challenge 3: Interview-style Question
Function.prototype.customBind = function (context, ...args1) {
       const fn = this;
    return function(...args2) {
      return fn.apply(context, [...args1, ...args2]);
    };
  };
  
  const person = {
    name: "Nikita",
    greet() {
      setTimeout(function () {
        console.log("Hi " + this.name);
      }.myBind(this), 1000);  // using custom bind
    },
  };
  
  person.greet();

