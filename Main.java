package fawrychallenge;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        // Use Case 1: Successful checkout with valid products
        Customer c1 = new Customer("Fares", 1000);
        Cart cart1 = new Cart();

        Product scratchCard = new Product("Scratch Card", 50, 5);
        Cheese cheese = new Cheese("Feta", 100, 2, LocalDate.now().plusMonths(6), 0.2);
        ExpirableProduct biscuits = new ExpirableProduct("Biscuits", 150, 1, LocalDate.now().plusMonths(3));

        cart1.add(cheese, 2);
        cart1.add(biscuits, 1);
        cart1.add(scratchCard, 1);

        OrderProcessor.checkout(c1, cart1);


        // Use Case 2: Product is expired, checkout should fail
        Customer c2 = new Customer("esraa", 500);
        Cart cart2 = new Cart();
        Cheese expired = new Cheese("Halloumi", 100, 1, LocalDate.of(2023, 1, 1), 0.3);

        cart2.add(expired, 1);
        OrderProcessor.checkout(c2, cart2);


        // Use Case 3: Customer doesn't have enough money to pay
        Customer c3 = new Customer("nour", 50);
        Cart cart3 = new Cart();
        Product tv = new Product("TV", 1000, 1);

        cart3.add(tv, 1);
        OrderProcessor.checkout(c3, cart3);


        // Use Case 4: Adding more items than available in stock
        Product eggs = new Product("Eggs", 10, 2);
        Cart cart4 = new Cart();
        cart4.add(eggs, 5); // should not be allowed


        // Use Case 5: checkout with an empty cart
        Customer c5 = new Customer("ahmed", 300);
        Cart cart5 = new Cart();
        OrderProcessor.checkout(c5, cart5);
    }
}

