//HOFs
// function calculate(arr, logicFn) {
//     return arr.map(logicFn);
// }

// function circleArea(radius) {
//     return Math.PI*radius*radius;
// }

// let areas = calculate([2,3,4], circleArea);
// console.log(areas);

//Array Methods: Map, Filter, Reduce
// let result = [1, 2, 3].map(num => num*num);
// console.log(result);

// let positives = [-1, 2, 3, -4].filter(num => num > 0);
// console.log(positives);

// let sum = [1, 2, 3].reduce((acc, current) => acc + current, 0);
// console.log(sum);

/* ✅ Practice 4.1: Implement Your Own filter() Function (Polyfill)
Array.prototype.filter() ek built-in function hota hai jo array ke har element ko check karta hai based on true/false condition. Aur jo elements condition pass karte hain unhi ko naya array mein return karta hai.

👉 Tumhe khud ka myFilter() function banana hai jo same kaam kare.*/

/* const nums = [1, 2, 3, 4, 5, 6];

Array.prototype.myFilter = function(callback) {
  let result = [];
  for (let i = 0; i < this.length; i++) {
    if (callback(this[i], i, this)) {
      result.push(this[i]);
    }
  }
  return result;
};

const result = nums.myFilter(function(num) {
  return num % 2 === 0;
});

console.log(result); */

/*ChatGPT said:
Perfect! Chalo shuru karte hain Practice 4.2 – based on Functional Programming aur filter method ka concept.

🧩 Practice 4.2: Create your own myMap method
🔸 Tumhe Array.prototype.myMap implement karna hai — jaise hum JS mein .map() use karte hain.

✅ Requirement:
Har element par callback function apply karna hai.

Uska result ek naye array mein push karna hai.

Original array ko modify nahi karna hai.*/

/*const numbers = [1, 2, 3, 4];

Array.prototype.myMap = function(callback) {
    let result = [];
    for(let i = 0; i < this.length; i++) {
        result.push(callback(this[i], i, this));
    }
    return result;
};

const result = numbers.myMap(function(num) {
  return num * 2;
});

console.log(result);*/

/* 🔁 Question – Custom Filter Function
Tumhe JavaScript ka filter() method khud implement karna hai as myFilter.*/

/*const numbers = [10, 25, 30, 45, 60];

Array.prototype.myFilter = function(callback) {
  let result = [];
  for(let i = 0; i < this.length; i++) {
    if (callback(this[i], i, this)) {
        result.push(this[i]);
    }
  }
  return result;
};

const result = numbers.myFilter(function(num) {
  return num > 30;
});

console.log(result);*/

/*🧠 Practice Question: Custom Reduce
Tumhe Array.prototype.myReduce() banana hai jo native reduce() ki tarah kaam kare.

📌 Instructions:

myReduce() ek callback function lega

Ek optional initialValue bhi accept karega

Callback ka kaam hoga: (accumulator, currentValue, index, array) => {}*/

/*const numbers = [1, 2, 3, 4];

Array.prototype.myReduce = function(callback, initialValue) {
    let acc = initialValue;

    for(let i = 0; i < this.length; i++) {
        acc = callback(acc, this[i], i, this);
    }
    return acc;
};
const sum = numbers.myReduce(function(acc, curr) {
  return acc + curr;
}, 0);

console.log(sum);*/

//🔸 Practice Question: Sum of Even Numbers Using myReduce()
/*const numbers = [1, 2, 3, 4, 5, 6];

Array.prototype.myReduce = function(callback, initialValue) {
  let acc = initialValue;

  for (let i = 0; i < this.length; i++) {
    acc = callback(acc, this[i], i, this);
  }
  return acc;
};

const sum = numbers.myReduce(function(acc, curr) {
  if (curr % 2 === 0) {
  return acc + curr;
}
return acc;
}, 0);
console.log(sum);*/

/*Problem:
Given an array of numbers, write a custom mySome function that mimics the behavior of the Array.prototype.some() method. This function should return true if at least one element in the array passes the test implemented by the provided function, and false otherwise.*/
/*const numbers = [1, 2, 3, 4, 5];

Array.prototype.mySome = function(callback) {
    for (let i = 0; i < this.length; i++) {
        if (callback(this[i], i, this)) {
            return true;  // Agar koi element condition ko satisfy kare, return true
        }
    }
    return false;  // Agar koi element condition ko satisfy na kare, return false
};

const result = numbers.mySome(function(num) {
    return num > 4;
});

console.log(result);*/

/*❓ Question: Custom Implementation of every()
Custom myEvery() function banao using prototype, jo tabhi true return kare jab array ke saare elements callback condition ko satisfy karein.*/

/*const numbers = [2, 4, 6, 8];

Array.prototype.myEvery = function(callback) {
    for (let i = 0; i < this.length; i++) {
        if (!callback(this[i], i, this)) {
            return false;
        }
    }
    return true;
};

const result = numbers.myEvery(function(num) {
  return num % 2 === 0;
});

console.log(result);*/

/*🧪 Tumhe ek naya array banana hai prices ka:

js
Copy
Edit
[70000, 30000, 20000]
Use map() to extract prices.*/

/*const products = [
    { name: "Laptop", price: 70000 },
    { name: "Phone", price: 30000 },
    { name: "Tablet", price: 20000 }
  ];

  const prices = products.map(function(product) {
    return product.price;
  });

  console.log(prices);*/

 /* const users = [
    { name: "Rahul", age: 17 },
    { name: "Priya", age: 22 },
    { name: "Amit", age: 16 },
    { name: "Sneha", age: 25 }
  ];
  
  const result = users
    .filter(function(user) {
      return user.age > 18; 
    })
    .map(function(user) {
      return user.name;
    });
  
  console.log(result); */

  const products = [
    { name: "Laptop", price: 70000 },
    { name: "Phone", price: 30000 },
    { name: "Tablet", price: 20000 }
  ];
  
  function sumArray(products) {
    let totalSum = products.reduce(function(accumulator, currentValue) {
        return accumulator + currentValue.price;
    }, 0);
    return totalSum;
  }
  console.log(sumArray(products));