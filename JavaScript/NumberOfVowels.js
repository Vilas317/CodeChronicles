/*Write a function that takes in a string and returns the count of vowels in that string.
Consider the vowels to be a, e, i, o, u (both uppercase and lowercase).

Example:

Input:
"Hello World"
Output:
3 (Because there are 2 'o's and 1 'e')*/

function main(str) {
    const vowels = 'aeiouAEIOU';
    let count = 0;
    for(let char of str) {
        if(vowels.includes(char)) {
            count++;
        }
    }
    return count;
}