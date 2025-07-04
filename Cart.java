package fawrychallenge;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fares salem
 */

public class Cart {
    List<CartItem> items = new ArrayList<>();

    public void add(Product product, int quantity) {
        if (quantity > product.getQuantity()) {
            System.out.println("Not enough quantity for " + product.getName());
            return;
        }

        product.reduceQuantity(quantity);
        items.add(new CartItem(product, quantity));
        System.out.println(quantity + "x " + product.getName() + " added to cart.");
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public List<CartItem> getItems() {
        return items;
    }
}
