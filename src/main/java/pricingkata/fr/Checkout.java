package pricingkata.fr;

import java.math.BigDecimal;

public class Checkout {

    public Price total(Item item) {
        BigDecimal itemPrice = item.getPrice().getAmount();
        int itemQuantity = item.getQuantity();

        return Price.of(itemPrice.multiply(new BigDecimal(itemQuantity)));
    }
}
