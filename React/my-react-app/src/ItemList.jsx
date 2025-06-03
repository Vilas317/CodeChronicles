// Q1. Rendering List of Items in React

// You are provided with a React code snippet that aims to render a list of stationary items. Your task is to complete the code by implementing the component responsible for rendering the list of stationary items. Instructions:

// Write a React component named ItemList that renders a list of stationary items provided in the stationary array.
// Ensure that each item in the list is enclosed within an
// element and has a unique key attribute assigned.
// Use the map function to iterate over the stationary array and generate the list items dynamically.

// Q2. Key Props in React

// You are provided with a React code snippet that aims to render a list of stationary items. Your task is to complete the code by implementing the component responsible for rendering the list of stationary items. Instructions:

// Write a React component named ItemList that renders a list of stationary items provided in the stationary array.
// Ensure that each item in the list is enclosed within an
// element and has a unique key attribute assigned.
// Use the map function to iterate over the stationary array and generate the list items dynamically.

// function ItemList({ items }) {
//     return (
//       <ul>
//         {items.map((item, index) => (
//           <li key={index}>{item}</li>  // ✅ key is important
//         ))}
//       </ul>
//     );
//   }
  
//   export default ItemList;
  
// function ItemList({ list }) {
//   // Implement the ItemList component to render the list of stationary items here
//   return (
//     <div>
//     <ul> 
//       {list.map((item, index) => (
//         <li key = {index}>{item.name}</li>
//       ))}
//     </ul>
//     </div>
//   );
// }

// export default ItemList;
