package pricingkata.fr;

public class LineItem {

    private Item item;
    private int quantity;

    public LineItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Price lineItemTotalPrice() {

        return Price.of(item.getPrice().getAmount() * quantity);
    }

    public Price add(LineItem lineItem) {

        return Price.of((lineItem.item.getPrice().getAmount() * lineItem.quantity) +
                (this.item.getPrice().getAmount() * this.quantity));
    }


}
