package pricingkata.fr;

import java.util.Objects;

public class Price {

    private final double amount;

    private Price(double amount) {

        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public static Price of(double amount) {
        return new Price(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(amount, price.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "Price{" +
                "amount=" + amount +
                '}';
    }
}
