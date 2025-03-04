const accountId = 144553
let accountEmail = "abcd@gmail.com"
var accountPassword = "12345"
accountCity = "Bhopal"
let accountState;

// accountId = 2 // Not allowed
accountEmail = "ab@gmail.com"
accountPassword = "234567"
accountCity = "MP"

console.log(accountId);
/*
Prefer not to use var
because of issue in block scope and functional scope
*/
console.table([accountId, accountEmail, accountPassword, accountCity, accountState]);