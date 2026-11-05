import { useEffect, useMemo, useState } from "react";
import {
  ShoppingCart,
  Search,
  Plus,
  Minus,
  Trash2,
  ArrowLeft,
  Store,
  PackageCheck,
} from "lucide-react";

const API_URL = "http://localhost:8080/api/products";

// Indian currency formatter
const money = (value) => `₹${Number(value || 0).toLocaleString("en-IN")}`;

function Header({
  page,
  setPage,
  cartCount,
  search,
  setSearch,
  category,
  setCategory,
  categories,
}) {
  const [menuOpen, setMenuOpen] = useState(false);

  return (
    <header className="topbar">
      <button className="brand" onClick={() => setPage("home")}>
        <span className="brand-mark">
          <Store size={19} />
        </span>
        Telusko
      </button>

      <nav className="main-nav">
        <button
          className={page === "home" ? "nav-link active" : "nav-link"}
          onClick={() => setPage("home")}
        >
          Home
        </button>

        <button
          className={page === "add" ? "nav-link active" : "nav-link"}
          onClick={() => setPage("add")}
        >
          Add Product
        </button>

        <div className="category-wrap">
          <button
            className="nav-link category-toggle"
            onClick={() => setMenuOpen(!menuOpen)}
          >
            Categories <span className="chevron">▾</span>
          </button>

          {menuOpen && (
            <div className="category-menu">
              <button
                onClick={() => {
                  setCategory("All");
                  setPage("home");
                  setMenuOpen(false);
                }}
              >
                All products
              </button>

              {categories.map((item) => (
                <button
                  key={item}
                  onClick={() => {
                    setCategory(item);
                    setPage("home");
                    setMenuOpen(false);
                  }}
                >
                  {item}
                </button>
              ))}
            </div>
          )}
        </div>
      </nav>

      <div className="header-actions">
        <button className="cart-link" onClick={() => setPage("cart")}>
          <ShoppingCart size={19} />
          <span>Cart</span>
          {cartCount > 0 && <b className="cart-count">{cartCount}</b>}
        </button>

        <label className="search-box">
          <Search size={17} />
          <input
            value={search}
            onChange={(e) => {
              setSearch(e.target.value);
              setPage("home");
            }}
            placeholder="Search products..."
          />
        </label>
      </div>
    </header>
  );
}

// Product Card
function ProductCard({ product, onAdd }) {
  return (
    <article className="product-card">
      <div className="product-art">
        <span>{product.emoji || "📦"}</span>
        <small>{product.category}</small>
      </div>

      <div className="product-info">
        <h3>{product.name}</h3>

        <p className="brand-name">
          by <em>{product.brand}</em>
        </p>

        <p>{product.description}</p>

        <div className="product-bottom">
          <strong>{money(product.price)}</strong>

          <button
            className="primary-btn add-btn"
            onClick={() => onAdd(product)}
          >
            <Plus size={16} /> Add to Cart
          </button>
        </div>
      </div>
    </article>
  );
}

// Home Page
function Home({ products, onAdd, category, setCategory, categories, search }) {
  const visible = products.filter(
    (p) =>
      (category === "All" || p.category === category) &&
      `${p.name} ${p.brand} ${p.category}`
        .toLowerCase()
        .includes(search.toLowerCase()),
  );

  return (
    <main className="page-shell">
      <section className="welcome-row">
        <div>
          <p className="eyebrow">WELCOME TO TELUSKO</p>
          <h1>Find what you need.</h1>
          <p className="subheading">Everyday essentials, all in one place.</p>
        </div>

        <div className="welcome-badge">
          <PackageCheck size={18} />
          Curated picks for you
        </div>
      </section>

      <div className="section-heading">
        <div>
          <h2>Our Products</h2>
          <p>{visible.length} products available</p>
        </div>

        <select
          className="filter-select"
          value={category}
          onChange={(e) => setCategory(e.target.value)}
        >
          <option value="All">All categories</option>

          {categories.map((c) => (
            <option key={c} value={c}>
              {c}
            </option>
          ))}
        </select>
      </div>

      {visible.length > 0 ? (
        <div className="product-grid">
          {visible.map((product) => (
            <ProductCard key={product.id} product={product} onAdd={onAdd} />
          ))}
        </div>
      ) : (
        <div className="empty-state">
          <span>🔎</span>
          <h3>No products found</h3>
          <p>Try another search or category.</p>

          <button
            className="secondary-btn"
            onClick={() => {
              setCategory("All");
            }}
          >
            Clear filters
          </button>
        </div>
      )}
    </main>
  );
}

// Add Product Page
function AddProduct({ onSave, onCancel, categories }) {
  const [form, setForm] = useState({
    name: "",
    brand: "",
    price: "",
    category: categories[0] || "Electronics",
    description: "",
  });

  const [error, setError] = useState("");

  const update = (e) => {
    setForm({
      ...form,
      [e.target.name]: e.target.value,
    });
  };

  const submit = async (e) => {
    e.preventDefault();

    if (
      !form.name.trim() ||
      !form.brand.trim() ||
      form.price === "" ||
      Number(form.price) < 0
    ) {
      setError("Please enter a product name, brand and valid price.");
      return;
    }

    const success = await onSave({
      name: form.name.trim(),
      brand: form.brand.trim(),
      category: form.category,
      description: form.description,
      price: Number(form.price),
    });

    if (!success) {
      setError("Unable to save product. Please check your backend.");
    }
  };

  return (
    <main className="page-shell narrow-shell">
      <button className="back-link" onClick={onCancel}>
        <ArrowLeft size={16} /> Back to products
      </button>

      <div className="form-card">
        <div className="form-title">
          <span className="form-icon">
            <Plus />
          </span>

          <div>
            <p className="eyebrow">PRODUCT MANAGEMENT</p>
            <h1>Add a new product</h1>
            <p className="subheading">
              Fill in the details below to add an item to your store.
            </p>
          </div>
        </div>

        <form onSubmit={submit} className="product-form">
          <div className="field-grid">
            <label>
              Product name
              <input
                name="name"
                value={form.name}
                onChange={update}
                placeholder="e.g. Laptop"
                required
              />
            </label>

            <label>
              Brand
              <input
                name="brand"
                value={form.brand}
                onChange={update}
                placeholder="e.g. ASUS"
                required
              />
            </label>

            <label>
              Price (₹)
              <input
                name="price"
                type="number"
                min="0"
                step="0.01"
                value={form.price}
                onChange={update}
                placeholder="Enter price"
                required
              />
            </label>

            <label>
              Category
              <select name="category" value={form.category} onChange={update}>
                {[...new Set(["Electronics", ...categories])].map((c) => (
                  <option key={c} value={c}>
                    {c}
                  </option>
                ))}
              </select>
            </label>
          </div>

          <label>
            Description
            <textarea
              name="description"
              rows="4"
              value={form.description}
              onChange={update}
              placeholder="Write a short product description..."
            />
          </label>

          {error && <p className="form-error">{error}</p>}

          <div className="form-actions">
            <button type="button" className="secondary-btn" onClick={onCancel}>
              Cancel
            </button>

            <button className="primary-btn" type="submit">
              <Plus size={17} /> Save Product
            </button>
          </div>
        </form>
      </div>
    </main>
  );
}

// Cart Page
function Cart({ cart, onQuantity, onRemove, onShop }) {
  const subtotal = cart.reduce(
    (sum, item) => sum + Number(item.price) * item.quantity,
    0,
  );

  return (
    <main className="page-shell">
      <div className="cart-heading">
        <div>
          <p className="eyebrow">YOUR SELECTION</p>
          <h1>Shopping Cart</h1>
          <p className="subheading">Review your items before checkout.</p>
        </div>

        <button className="secondary-btn" onClick={onShop}>
          <ArrowLeft size={16} /> Continue shopping
        </button>
      </div>

      {cart.length === 0 ? (
        <div className="empty-state cart-empty">
          <span>🛒</span>
          <h3>Your cart is empty</h3>
          <p>Looks like you haven't added anything yet.</p>

          <button className="primary-btn" onClick={onShop}>
            Explore products
          </button>
        </div>
      ) : (
        <div className="cart-layout">
          <section className="cart-items">
            {cart.map((item) => (
              <article className="cart-item" key={item.id}>
                <div className="cart-art">{item.emoji || "📦"}</div>

                <div className="cart-item-main">
                  <h3>{item.name}</h3>

                  <p>
                    {item.brand} · {money(item.price)} each
                  </p>

                  <div className="quantity-control">
                    <button
                      onClick={() => onQuantity(item.id, -1)}
                      aria-label="Decrease quantity"
                    >
                      <Minus size={14} />
                    </button>

                    <b>{item.quantity}</b>

                    <button
                      onClick={() => onQuantity(item.id, 1)}
                      aria-label="Increase quantity"
                    >
                      <Plus size={14} />
                    </button>
                  </div>
                </div>

                <strong className="line-total">
                  {money(item.price * item.quantity)}
                </strong>

                <button
                  className="remove-btn"
                  onClick={() => onRemove(item.id)}
                  aria-label="Remove item"
                >
                  <Trash2 size={17} />
                </button>
              </article>
            ))}
          </section>

          <aside className="summary-card">
            <h2>Order summary</h2>

            <div className="summary-line">
              <span>Subtotal</span>
              <b>{money(subtotal)}</b>
            </div>

            <div className="summary-line">
              <span>Shipping</span>
              <b className="free-shipping">Free</b>
            </div>

            <div className="summary-line total-line">
              <span>Total</span>
              <strong>{money(subtotal)}</strong>
            </div>

            <button
              className="primary-btn checkout-btn"
              onClick={() =>
                alert("Demo checkout. Payment integration is not configured.")
              }
            >
              Proceed to checkout
            </button>

            <p className="secure-note">🔒 Secure checkout · Demo frontend</p>
          </aside>
        </div>
      )}
    </main>
  );
}

// Main App
export default function App() {
  const [products, setProducts] = useState([]);
  const [cart, setCart] = useState([]);
  const [page, setPage] = useState("home");
  const [search, setSearch] = useState("");
  const [category, setCategory] = useState("All");

  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  // Fetch products from Spring Boot + H2
  const fetchProducts = async () => {
    try {
      setLoading(true);

      const response = await fetch(API_URL);

      if (!response.ok) {
        throw new Error("Failed to fetch products");
      }

      const data = await response.json();

      setProducts(data);
      setError("");
    } catch (err) {
      console.error("Product fetch error:", err);
      setError(
        "Unable to load products. Please start your Spring Boot backend.",
      );
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchProducts();
  }, []);

  const categories = useMemo(
    () => [...new Set(products.map((p) => p.category).filter(Boolean))],
    [products],
  );

  const cartCount = cart.reduce((sum, item) => sum + item.quantity, 0);

  // Add to cart
  const addToCart = (product) => {
    setCart((old) => {
      const found = old.find((item) => item.id === product.id);

      return found
        ? old.map((item) =>
            item.id === product.id
              ? { ...item, quantity: item.quantity + 1 }
              : item,
          )
        : [...old, { ...product, quantity: 1 }];
    });
  };

  // Change cart quantity
  const changeQuantity = (id, amount) => {
    setCart((old) =>
      old
        .map((item) =>
          item.id === id ? { ...item, quantity: item.quantity + amount } : item,
        )
        .filter((item) => item.quantity > 0),
    );
  };

  // Save product to Spring Boot database
  const saveProduct = async (product) => {
    try {
      const response = await fetch(API_URL, {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(product),
      });

      if (!response.ok) {
        throw new Error("Unable to save product");
      }

      await fetchProducts();

      setCategory("All");
      setSearch("");
      setPage("home");

      return true;
    } catch (err) {
      console.error("Save product error:", err);
      return false;
    }
  };

  return (
    <div className="app">
      <Header
        page={page}
        setPage={setPage}
        cartCount={cartCount}
        search={search}
        setSearch={setSearch}
        category={category}
        setCategory={setCategory}
        categories={categories}
      />

      {loading ? (
        <main className="page-shell">
          <h2>Loading products...</h2>
        </main>
      ) : error ? (
        <main className="page-shell">
          <h2>{error}</h2>
          <button className="primary-btn" onClick={fetchProducts}>
            Retry
          </button>
        </main>
      ) : (
        <>
          {page === "home" && (
            <Home
              products={products}
              onAdd={addToCart}
              category={category}
              setCategory={setCategory}
              categories={categories}
              search={search}
            />
          )}

          {page === "add" && (
            <AddProduct
              onSave={saveProduct}
              onCancel={() => setPage("home")}
              categories={categories}
            />
          )}

          {page === "cart" && (
            <Cart
              cart={cart}
              onQuantity={changeQuantity}
              onRemove={(id) =>
                setCart((old) => old.filter((item) => item.id !== id))
              }
              onShop={() => setPage("home")}
            />
          )}
        </>
      )}

      <footer className="footer">
        <span>© {new Date().getFullYear()} Telusko Store</span>
        <span>Built with React + Spring Boot + H2</span>
      </footer>
    </div>
  );
}
