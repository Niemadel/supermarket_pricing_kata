import org.junit.jupiter.api.Test;
import pricingkata.fr.Item;
import pricingkata.fr.LineItem;
import pricingkata.fr.Price;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static pricingkata.fr.Price.checkoutTotalPrice;
import static pricingkata.fr.Price.lineItemTotalPrice;

public class CheckoutTest {

    @Test
    void checkout_when_item_price_is_zero_return_zero() {
        Item itemA = new Item("A", Price.of(0));
        LineItem lineItem = new LineItem(itemA, 1);

        Price totalPrice = lineItemTotalPrice(lineItem);
        Price expectedTotal = Price.of(0);

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_when_item_price_is_2_and_quantity_is_3_return_6() {
        Item itemA = new Item("A", Price.of(2));
        LineItem lineItem = new LineItem(itemA, 3);

        Price totalPrice = lineItemTotalPrice(lineItem);
        Price expectedTotal = Price.of(6);

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_when_item_price_is_1_2_and_quantity_1_return_1_2() {
        Item itemA = new Item("A", Price.of(1.20));
        LineItem lineItem = new LineItem(itemA, 1);

        Price totalPrice = lineItemTotalPrice(lineItem);
        Price expectedTotal = Price.of(1.20);

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_with_3_items_with_price_0_65_and_2_items_with_price_1_20_should_return_total_of_4_35() {
        Item itemA = new Item("A", Price.of(0.65));
        Item itemB = new Item("B", Price.of(1.20));

        LineItem lineItemA = new LineItem(itemA, 3);
        LineItem lineItemB = new LineItem(itemB, 2);

        List<LineItem> lineItems = new ArrayList<>();
        lineItems.add(lineItemA);
        lineItems.add(lineItemB);

        Price expectedTotal = Price.of(4.35);

        Price TotalPrice = checkoutTotalPrice(lineItems);
        assertThat(TotalPrice).isEqualTo(expectedTotal);
    }
}
