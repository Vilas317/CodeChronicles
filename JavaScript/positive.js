/*Write a JavaScript function named allPositive that checks whether all numbers in a given array are positive using the every() method.

Inputs:
An array of numbers.

Outputs:
A boolean value. Return true if all numbers are positive, otherwise false.*/

function allPositive(numbers) {
    return numbers.every(num => num > 0);
}