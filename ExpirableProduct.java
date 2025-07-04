package fawrychallenge;
import java.time.LocalDate;


/**
 *
 * @author fares salem
 */

public class ExpirableProduct extends Product {
    LocalDate expiryDate;

    public ExpirableProduct(String name, double price, int quantity, LocalDate expiryDate) {
        super(name, price, quantity); 
        this.expiryDate = expiryDate;
    }

    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
