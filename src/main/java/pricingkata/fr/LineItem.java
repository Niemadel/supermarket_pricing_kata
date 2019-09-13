package pricingkata.fr;

import java.math.BigDecimal;

public class LineItem {

    private Price unitPrice;
    private int quantity;

    public LineItem(Price unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Price total() {

        BigDecimal itemPrice = unitPrice.getAmount();
        int itemQuantity = quantity;

        return Price.of(itemPrice.multiply(new BigDecimal(itemQuantity)));
    }

    public boolean containsOfferThreeForOne(LineItem lineItem) {
        return lineItem.quantity >= 3;
    }
}
