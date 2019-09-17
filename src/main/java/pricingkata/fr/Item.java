package pricingkata.fr;

public final class Item {

    private String id;
    private Price price;

    public Item(String id, Price price) {
        this.id = id;
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }
}