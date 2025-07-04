package fawrychallenge;

/**
 *
 * @author fares salem
 */
public class Customer {
    String name;
    double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean canPay(double amount) {
        return balance >= amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}