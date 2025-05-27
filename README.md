# ☕ Coffee Machine Architecture

## 🧾 Overview

A simple model of a Coffee Machine system including core Classes and user interaction flow for purchasing coffee.

---

## 📦 Classes

### 1. `Money`
Represents the user's current balance.

- **Attributes**:
  - `balance`: *number* — current amount of money available.

---

### 2. `Coffee`
Represents a type of coffee.

- **Attributes**:
  - `name`: *string* — name of the coffee (e.g., Espresso, Latte).
  - `price`: *number* — cost of the coffee.

---

### 3. `CoffeeMachine`
Manages the inventory and serves coffee.

- **Attributes**:
  - `coffees`: *Map<Coffee, quantity>* — list of available coffees and their quantities.

---

## 🔄 User Flow

### 1. 💰 Pay (with Coins or Card)

- Deduct `Coffee.price` from `Money.balance`.

#### ✅ Success:
- Return payment value.

#### ❌ Errors:
- `Money.balance < Coffee.price`:
  - Throw Error: **"Insufficient balance"**

---

### 2. ☕ Choose Coffee

- Select one coffee from the available list.

#### ✅ Success:
- Return selected `Coffee`.

#### ❌ Errors:
- `quantity == 0`:  
  - Throw Error: **"Sold out"**
- Power outage:  
  - Throw **Runtime Error**
- No water:  
  - Throw Error: **"Out of water"**

---

### 3. ✅ Get Coffee

- Serve the coffee if payment and selection are valid.

#### ✅ Success:
- Return the prepared `Coffee`.

#### ❌ Errors:
- If payment not made or coffee not selected:
  - Throw Error: **"Please pay or coffee not available"**

---

## ✅ Summary

This architecture ensures:
- Proper validation of balance and stock.
- Error handling for common issues.
- A clean and modular structure for extendability.
