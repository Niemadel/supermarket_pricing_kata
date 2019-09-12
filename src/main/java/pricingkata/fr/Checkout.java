package pricingkata.fr;

import java.math.BigDecimal;

public class Checkout {

    private Item item;

    public Checkout(Item item) {
        this.item = item;
    }

    public Price total(Item item) {
        BigDecimal itemPrice = item.getPrice().getAmount();
        int itemQuantity = item.getQuantity();
        return Price.of(itemPrice.multiply(new BigDecimal(itemQuantity)));
    }
}
