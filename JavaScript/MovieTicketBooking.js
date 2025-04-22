/*🧠 Requirements:
Ek wallet variable lo (maan lo ₹800 initially).

Ek function banao bookTicket(movieName, ticketCount)

Har ticket ₹250 ka hai.

Agar user ke paas enough balance hai:

Total ticket price deduct karo

Movie name and ticket count store karo ek bookings array mein

Message print karo: Booked X ticket(s) for [Movie]. Remaining balance: ₹Y

Agar balance insufficient ho:

Message print karo: Insufficient balance to book tickets for [Movie]

End mein bookings array print karo.*/

let wallet = 800;
let bookings = [];

function bookTickets(movieName, ticketCount) {
    const ticketPrice =  250;
    const totalCost = ticketPrice * ticketCount;
    if(wallet >= ticketCount) {
        wallet -= totalCost;
        bookings.push({
            movie: movieName,
            ticket: ticketCount
        });
        console.log(`Booked ${ticketCount} ticket(s) for ${movieName}. Remaining balance: ₹${wallet}`);
    } else {
        console.log(`Insufficient balance to book ${ticketCount} ticket(s) for ${movieName}`);
    }
}

bookTickets("Avengers EndGame", 250);
bookTickets("John Wick", 250);
bookTickets("Krrish 4", 250);

console.log("Bookings", bookings);