import org.junit.jupiter.api.Test;
import pricingkata.fr.Checkout;
import pricingkata.fr.Item;
import pricingkata.fr.Price;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutTest {

    @Test
    void checkout_when_item_price_is_zero_return_zero() {
        Item item = new Item(Price.of(new BigDecimal(0.00)), 1);
        Checkout checkout = new Checkout();

        Price total = checkout.total(item);
        Price expectedTotal = Price.of(new BigDecimal(0));

        assertThat(total).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_when_item_price_is_2_and_quantity_is_3_return_6() {
        Item item = new Item(Price.of(new BigDecimal(2.00)), 3);
        Checkout checkout = new Checkout();

        Price total = checkout.total(item);
        Price expectedTotal = Price.of(new BigDecimal(6));

        assertThat(total).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_when_item_price_is_1and2_and_qauntity_1_return_1and2() {
        Item item = new Item(Price.of(new BigDecimal(1.20)), 1);
        Checkout checkout = new Checkout();

        Price total = checkout.total(item);
        Price expectedTotal = Price.of(new BigDecimal(1.20));

        assertThat(total).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_for_two_items_with_different_price_return_total_of_the_two_items_price() {
        Items items = new Items(item);
        Checkout checkout = new Checkout();

        Price total = checkout.total(items);
        Price expectedTotal = Price.of(new BigDecimal(1.68));

        assertThat(total).isEqualTo(expectedTotal);
    }
}
