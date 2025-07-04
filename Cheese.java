package fawrychallenge;

import java.time.LocalDate;

/**
 *
 * @author fares salem
 */
public class Cheese extends ExpirableProduct implements Shippable {
    double weight;

    public Cheese(String name, double price, int quantity, LocalDate expiryDate, double weight) {
        super(name, price, quantity, expiryDate);
        this.weight = weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}