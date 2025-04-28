// let day = "Furday";

// switch(day) {
//     case "Monday":
//     case "Tuesday":
//     case "Wednesday":
//     case "Thursday":
//     case "Friday":
//         console.log("Office day");
//         break;

// case "Saturday":
// case "Sunday":
//         console.log("Weekend!");
//         break;

// default:
//     console.log("Invalid Input");
// }

let marks = 54.3;

switch(true) {
    case (marks >= 90):
    console.log("Grade: A+");
    break;

    case (marks >= 80):
    console.log("Grade: A");
    break;
    
    case (marks >= 70):
    console.log("Grade: B");
    break;

    case (marks >= 60):
    console.log("Grade: C");
    break;

    case (marks >= 50):
    console.log("Grade: D");
    break;

    default:
        console.log("Grade: F");
}