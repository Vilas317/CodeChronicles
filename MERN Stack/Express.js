// 1. Ek Express server banao jo /products endpoint banaye aur ek list return kare.
// 2. Ek POST API banao jisse tum products list me naye product add kar sako.
// 3 .Server ko 3000 port par run karo.
const express = require('express');
const app = express();

app.use(express.json());

let products = [
  { Product: 1, name: "PlayStation 5" },
  { Product: 2, name: "XBOX 360" },
];

// GET request to /products
app.get('/products', (req, res) => {
  res.json(products);
});

// POST request to /products
app.post('/products', (req, res) => {
  const newProduct = req.body;
  products.push(newProduct);  // ✅ Corrected this line
  res.json({ message: "Product added", products });
});
// ✅ PUT - Update product by ID
app.put('/products/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const updatedData = req.body;
  
    const productIndex = products.findIndex(p => p.id === id);
    if (productIndex !== -1) {
      products[productIndex] = { ...products[productIndex], ...updatedData };
      res.json({ message: "Product updated", product: products[productIndex] });
    } else {
      res.status(404).json({ error: "Product not found" });
    }
  });
  
  // ✅ DELETE - Delete product by ID
  app.delete('/products/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const initialLength = products.length;
  
    products = products.filter(p => p.id !== id);
  
    if (products.length < initialLength) {
      res.json({ message: "Product deleted", products });
    } else {
      res.status(404).json({ error: "Product not found" });
    }
  });
// Server running on port 3000
app.listen(3000, () => {
  console.log('Server running on port 3000');
});