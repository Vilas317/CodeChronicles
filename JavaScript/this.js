// function show() {
//     console.log(this);
//   }
//   show(); // Global object (window in browsers) ya undefined in strict mode
  
const user = {
    name: "Rahul",
    greet: function () {
      console.log(this.name);
    },
  };
  user.greet(); // "Rahul"