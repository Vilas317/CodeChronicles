/*
Write a JavaScript function named doubleValues that takes an array of numbers and returns a new array where each number is doubled using the map() method.


Inputs:
An array of numbers.

Outputs:
An array of numbers where each number is doubled. */

function doubleValues(numbers) {
    return numbers.map(function(num) {
        return num * 2;
    });
}