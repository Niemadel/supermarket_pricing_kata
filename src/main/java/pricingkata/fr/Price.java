package pricingkata.fr;

import java.util.List;
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

    public static double lineItemAmount(LineItem lineItem) {
        return lineItem.getItem().getPrice().getAmount() * lineItem.getQuantity();
    }

    public static Price lineItemTotalPrice(LineItem lineItem) {
        return Price.of(lineItemAmount(lineItem));
    }

    public static Price checkoutTotalPrice(List<LineItem> lineItems) {
        double total = 0;
        for (LineItem lineItem : lineItems) {

            total += lineItemAmount(lineItem);

        }
        return Price.of(total);
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
