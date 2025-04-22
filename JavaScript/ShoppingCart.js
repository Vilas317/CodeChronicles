let wallet = 90000;
let cart = [];

function buyProduct(productName, productPrice) {
    if(wallet >= productPrice) {
        wallet -= productPrice;
        cart.push(productName);
        console.log(`${productName} added to cart.Remaining Balance: ₹${wallet}`);
    } else {
        console.log(`Insufficient Balance for ${productName}. Wallet: ₹${wallet}`);
    }
}

buyProduct("HeadPhones", 500);
buyProduct("Assassin's Credd Shadows PS5", 4999);
buyProduct("Canon R10", 75000);

console.log("🛒 Your cart:", cart);