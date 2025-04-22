/*📜 Problem Statement:
Ek online grocery store hai. Tumhare paas ek wallet amount hai. User kuch items kharid sakta hai — lekin sirf tab jab wallet mein enough balance ho.

📦 Requirements:
Start with a wallet amount, e.g. ₹1000

Store successful purchases in an array called purchases.

Create a function buyItem(itemName, quantity):

Har item ka price fixed hai:

"Rice": ₹60 per kg

"Wheat": ₹50 per kg

"Oil": ₹120 per litre

Calculate total cost = item price × quantity

If wallet has enough balance:

Deduct from wallet

Add purchase to purchases array

Print: ✅ Bought X unit(s) of ITEM. Remaining balance: ₹Y

Else:

Print: ❌ Insufficient balance to buy ITEM

At the end, print the complete purchases array.*/

let wallet = 1000;
let purchases = [];

function buyItem(itemName, quantity) {
    const prices = {
        Rice: 60,
        Wheat: 50,
        Oil: 120
    };

    if (!prices[itemName]) {
        console.log(`${itemName} is not available in the store.`);
        return;
    }

    const itemPrice = prices[itemName];
    const totalCost = itemPrice * quantity;

    if (wallet >= totalCost) {
        wallet -= totalCost;

        purchases.push({
            item: itemName,
            qty: quantity
        });

        console.log(`Bought ${quantity} unit(s) of ${itemName}. Remaining balance: ₹${wallet}`);
    } else {
        console.log(`Insufficient balance to buy ${itemName}`);
    }
}

buyItem("Rice", 3);   
buyItem("Wheat", 3);  
buyItem("Oil", 5);
buyItem("Maggie", 5);    

console.log("Purchases:", purchases);