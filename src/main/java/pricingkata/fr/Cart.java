package pricingkata.fr;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<LineItem> lineItems = new ArrayList<>();

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void add(LineItem lineItem) {
        lineItems.add(lineItem);
    }
}
