import org.junit.jupiter.api.Test;
import pricingkata.fr.LineItem;
import pricingkata.fr.Price;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutTest {

    @Test
    void checkout_when_item_price_is_zero_return_zero() {
        LineItem lineItem = new LineItem(Price.of(new BigDecimal(0.00)), 1);

        Price totalPrice = lineItem.total();
        Price expectedTotal = Price.of(new BigDecimal(0));

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_when_item_price_is_2_and_quantity_is_3_return_6() {
        LineItem lineItem = new LineItem(Price.of(new BigDecimal(2.00)), 3);

        Price totalPrice = lineItem.total();
        Price expectedTotal = Price.of(new BigDecimal(6));

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_when_item_price_is_1and2_and_qauntity_1_return_1and2() {
        LineItem lineItem = new LineItem(Price.of(new BigDecimal(1.20)), 1);

        Price totalPrice = lineItem.total();
        Price expectedTotal = Price.of(new BigDecimal(1.20));

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }

    @Test
    void lineItem_of_3_item_with_price_0_65_and_offer_is_3_for_1_return_total_price_0_65() {
        LineItem lineItem = new LineItem(Price.of(new BigDecimal(0.65)), 3);


        Price totalPrice = lineItem.total();
        Price expectedTotal = Price.of(new BigDecimal(0.65));

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }
}
