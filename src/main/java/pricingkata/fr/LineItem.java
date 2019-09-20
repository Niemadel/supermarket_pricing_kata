package pricingkata.fr;

public class LineItem {

    private Item item;
    private int quantity;

    public LineItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public double totalPrice() {
        return item.getPrice().getAmount() * quantity;
    }

}
