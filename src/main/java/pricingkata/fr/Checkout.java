package pricingkata.fr;

import java.util.List;

public class Checkout {

    public Price totalPrice(List<LineItem> lineItems) {

        Price total = null;
        for (LineItem lineItem : lineItems) {

            total = lineItem.add(lineItem);

        }
        return total;
    }


}
