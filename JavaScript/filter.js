/*Write a JavaScript function named filterOutOdd that uses the filter() method to filter out odd numbers from an array.

Example:

Inputs:
An array of numbers.

Outputs:
An array of numbers without odd numbers.

JavaScript (ES6)*/

function filterOutOdd(numbers) {
    return numbers.filter(function(num){
        return num % 2 == 0;
    });
}