/* Write an if-else statement to check if a user is older than 18.
If true, log "You are an adult." otherwise log "You are a minor."

main function will be called with an argument with the value of age.


Input Format
Integer


Constraints
n <= 10 ^ 9


Output Format
String

Sample Input 0
12

Sample Output 0
You are a minor. */

function main(userAge) {
    if(userAge >= 18) {
        return("You are an adult.");
    } else {
        return("You are an mimor.")
    }
}