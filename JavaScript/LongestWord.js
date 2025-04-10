/* Write a function that takes in a string and returns the longest word in that string.
If there are multiple words with the same length, return the first one you encounter.

Example:


Input:

"JavaScript is a fun programming language"


Output:

"programming" */

function fundLongestWord(str) {
    const words = str.split(' ');
    let longestWord = words[0] || '';
    for(let i = 1; i < words.length; i++) {
        if(words[i].length > longestWord.length) {
            longestWord = words[i];
        }
    }
    return longestWord;
}