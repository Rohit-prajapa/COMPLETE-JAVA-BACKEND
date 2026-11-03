# Telusko E-Commerce Frontend

A responsive React + Vite storefront inspired by the supplied screenshot.

## Features
- Product listing with sample products
- Search by product, brand, or category
- Category filtering from the navigation menu and product toolbar
- Add Product form with validation
- Shopping cart with quantity controls and remove action
- Responsive desktop, tablet, and mobile layout

## Run locally

1. Install Node.js (18+ recommended).
2. Open this folder in VS Code.
3. Open the terminal in this folder and run:

```bash
npm install
npm run dev
```

4. Open the local URL printed by Vite (usually http://localhost:5173).

## Notes
This is a frontend-only demo. Products and cart state are stored in React state and reset when the page reloads. The checkout button is a demo placeholder; connect your Spring Boot/REST backend and payment provider for production use.
