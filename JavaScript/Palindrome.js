/*Write a function that checks if a given string is a palindrome.
A palindrome is a word, phrase, number, or other sequences of characters which reads the same backward as forward (ignoring spaces, punctuation, and capitalization).

Example:

Input:
"Madam"

Output:
true*/
function isPalindrome(str) {
    const lowerStr = str.toLowerCase();
    const cleanedStr = lowerStr.replace(/[^a-z0-9]/g, '');
    const reversedStr = cleanedStr.split('').reverse().join('');
    return cleanedStr === reversedStr;
}