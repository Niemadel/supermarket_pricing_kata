import org.junit.jupiter.api.Test;
import pricingkata.fr.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutTest {

    @Test
    void checkout_when_item_price_is_zero_return_zero() {
        LineItem lineItem = new LineItem(new Item("A", Price.of(0)), 1);

        Price totalPrice = Price.of(lineItem.totalPrice());
        Price expectedTotal = Price.of(0);

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_when_item_price_is_2_and_quantity_is_3_return_6() {
        LineItem lineItem = new LineItem(new Item("A", Price.of(2)), 3);

        Price totalPrice = Price.of(lineItem.totalPrice());
        Price expectedTotal = Price.of(6);

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_when_item_price_is_1_2_and_quantity_1_return_1_2() {
        LineItem lineItem = new LineItem(new Item("A", Price.of(1.20)), 1);

        Price totalPrice = Price.of(lineItem.totalPrice());
        Price expectedTotal = Price.of(1.20);

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }

    @Test
    void checkout_with_3_items_with_price_0_65_and_2_items_with_price_1_20_should_return_total_of_4_35() {

        LineItem lineItemA = new LineItem(new Item("A", Price.of(0.65)), 3);
        LineItem lineItemB = new LineItem(new Item("B", Price.of(1.20)), 2);

        Checkout checkout = new Checkout();
        Cart cart = new Cart();

        cart.add(lineItemA);
        cart.add(lineItemB);

        Price expectedTotal = Price.of(4.35);

        Price totalPrice = checkout.totalPrice(cart);
        ;
        assertThat(totalPrice).isEqualTo(expectedTotal);
    }

    @Test
    void Checkout_with_3_items_with_price_0_65_and_special_offer_3_for_one_return_total_of_0_65() {


        Checkout checkout = new Checkout();
        Cart cart = new Cart();
        LineItem lineItemC = new LineItem(new Item("C", Price.of(0.65)), 3);
        ;
        cart.add(lineItemC);

        Discount discount = new Discount();
        discount.add();

        Price totalPrice = checkout.totalPrice(cart);
        Price expectedTotal = Price.of(0.65);

        assertThat(totalPrice).isEqualTo(expectedTotal);
    }
}
