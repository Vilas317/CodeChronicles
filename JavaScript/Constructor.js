// Q1: Ek Person class banao jisme name aur age ho. Method ho greet ka.

// class Person {
//     constructor(name, age) {
//         this.name = name;
//         this.age = age;
//     }

//     greet() {
//         console.log(`Hi, I am ${this.name} and I am ${this.age} years old.`);
//     }
// }

// const p1 = new Person("Robert", 25);
// p1.greet();

// Q3: Ek BankAccount class banao jisme getter/setter use ho for balance.

// class BankAccount {
//     constructor(balance) {
//       this.balance = balance;  // setter call hoga yahan
//     }
  
//     get balance() {
//       return this._balance;
//     }
  
//     set balance(value) {
//       if (value < 0) {
//         console.log("Insufficient Balance");
//       } else {
//         this._balance = value;
//       }
//     }
// }
  
// const b = new BankAccount(100000);
// console.log(b.balance);
// b.balance = -500000;

  
// Q2: Employee class banao jo Person se extend kare. Ek method ho work ka.
class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    greet() {
        console.log(`Hi, I am ${this.name} and I am ${this.age} years old.`);
    }
}

class Employee extends Person {
    constructor(name, age, position) {
        super(name, age);
        this.position = position;
    }

    work() {
        console.log(`${this.name} is working as a ${this.position}`);
    }
}

const emp1 = new Employee("Vilas", 28, "Software Developer");
emp1.greet();
emp1.work();