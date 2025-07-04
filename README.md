# Fawry Internship Challenge - Java Solution

This is my solution for the Fawry Quantum Internship Challenge.  
The task was to build a simple e-commerce system using OOP in Java.

## Project Summary

I created a set of Java classes that simulate basic e-commerce features like:

- Adding products (some can expire, some need shipping)
- A cart that holds items and their quantities
- A checkout process that calculates subtotal, shipping, and total
- A few checks like:
  - Not enough balance
  - Product is expired
  - Cart is empty
  - Quantity requested is more than what's in stock

## How to Run

You can open the project in NetBeans or any Java IDE.  
Run the `Main.java` file to see all the test cases.

Each case will print something in the console like:

- A successful checkout
- Errors if the cart is empty or product is expired
- Shipment summary if needed

## Files

These are the main Java files I used:

- Product.java
- ExpirableProduct.java
- Cheese.java
- Shippable.java
- CartItem.java
- Cart.java
- Customer.java
- OrderProcessor.java
- Main.java

I tried to keep everything simple and clear.

