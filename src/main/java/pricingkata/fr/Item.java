package pricingkata.fr;

public class Item {

    private Price price;
    private int quantity;

    public Item(Price price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
