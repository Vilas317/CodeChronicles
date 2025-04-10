/*Write a function that takes in an array of numbers and returns the maximum value in that array.

Example:

Input:
[1, 4, 2, 7, 5]

Output:
7*/
function findMaxValue(arr) {
    if(arr.length === 0) {
        return null;
    }
    let maxValue = arr[0];
    for(let i = 1; i < arr.length; i++) {
        if(arr[i] > maxValue) {
            maxValue = arr[i];
        }
    }
    return maxValue;
}