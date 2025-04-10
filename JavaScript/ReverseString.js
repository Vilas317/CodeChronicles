/*Create a function called reverseString that takes a string as input and returns the reversed version.

The function is called with the argument of a string that needs to be reversed.
Use array methods to reverse the string.

Input Format
String

Sample Input 0
hello

Sample Output 0
olleh*/

function reverseString(inputString) {
    return inputString.split('').reverse().join('');
}
reverseString("hello");