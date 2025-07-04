# Fawry Java Challenge

This is a small Java project for the Fawry internship.

## What it does

- You can create products with name, price, and quantity.
- Some products can expire (like cheese or biscuits).
- Some products need shipping and have weight.
- You can add products to a cart.
- There is a checkout that shows subtotal, shipping, and total.
- It gives errors if:
  - the product is expired
  - the cart is empty
  - the customer has no enough money
  - the quantity is more than what's in stock

## How to run it

Open the project in NetBeans (or any Java IDE).  
Run the `Main.java` file and check the console.

## Files in the project

- Product.java
- ExpirableProduct.java
- Cheese.java
- Shippable.java
- CartItem.java
- Cart.java
- Customer.java
- OrderProcessor.java
- Main.java
