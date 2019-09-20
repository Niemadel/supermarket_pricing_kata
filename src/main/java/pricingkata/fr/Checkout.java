package pricingkata.fr;

public class Checkout {

    public Price totalPrice(Cart cart) {
        double total = 0;
        for (LineItem lineItem : cart.getLineItems()) {

            total += lineItem.totalPrice();
        }

        return Price.of(total);
    }
}
