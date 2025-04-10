/* Write a JavaScript function named sumArray that takes an array of numbers and returns the sum of all the numbers in the array using the reduce() method.

The tests also check whether the reduce() method has been used.

Example:

Input:
[1, 2, 3, 4]

Output:
10
reduce() is used. */

function sumArray(numbers) {
    let totalSum = numbers.reduce(function(accumulator, currentValue) {
        return accumulator + currentValue;
    }, 0)
    return totalSum;
}