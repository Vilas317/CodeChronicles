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
let result = [1, 2, 3].map(num => num*num);
console.log(result);

let positives = [-1, 2, 3, -4].filter(num => num > 0);
console.log(positives);

let sum = [1, 2, 3].reduce((acc, current) => acc + current, 0);
console.log(sum);