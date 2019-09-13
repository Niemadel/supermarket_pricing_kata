package pricingkata.fr;

import java.util.ArrayList;
import java.util.List;

public class Items {

    private List<LineItem> lineItems = new ArrayList<>();

    public void add(LineItem lineItem) {
        lineItems.add(lineItem);
    }

}
