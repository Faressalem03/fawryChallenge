package fawrychallenge;
import java.util.List;


public class OrderProcessor {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        List<CartItem> items = cart.getItems();
        double subtotal = 0;
        double totalWeight = 0;

        for (CartItem item : items) {
            Product product = item.product;

            if (product instanceof ExpirableProduct) {
                ExpirableProduct exp = (ExpirableProduct) product;
                if (exp.isExpired()) {
                    System.out.println("Error: " + exp.getName() + " is expired.");
                    return;
                }
            }

            subtotal += item.getTotalPrice();

            if (product instanceof Shippable) {
                Shippable shippable = (Shippable) product;
                totalWeight += shippable.getWeight() * item.quantity;
            }
        }

        double shippingFee = totalWeight > 0 ? 30 : 0;
        double totalAmount = subtotal + shippingFee;

        if (!customer.canPay(totalAmount)) {
            System.out.println("Error: Insufficient balance.");
            return;
        }

        customer.pay(totalAmount);

        if (totalWeight > 0) {
            System.out.println("** Shipment notice **");
            for (CartItem item : items) {
                if (item.product instanceof Shippable) {
                    Shippable ship = (Shippable) item.product;
                    double totalItemWeight = ship.getWeight() * item.quantity;
                    System.out.println(item.quantity + "x " + ship.getName() + "\t" + (totalItemWeight * 1000) + "g");
                }
            }
            System.out.println("Total package weight " + totalWeight + "kg\n");
        }

        System.out.println("** Checkout receipt **");
        for (CartItem item : items) {
            System.out.println(item.quantity + "x " + item.product.getName() + "\t" + item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.println("Subtotal\t" + subtotal);
        System.out.println("Shipping\t" + shippingFee);
        System.out.println("Amount\t\t" + totalAmount);
        System.out.println("Balance\t\t" + customer.getBalance());

    }
}    