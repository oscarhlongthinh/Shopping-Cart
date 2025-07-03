// OSCAR HUA
// ASSIGNMENT 1
// IT CS 143

public class ItemOrder {
    private Item item;
    private int quantity;

    // Constructs an order for the given item and quantity
    public ItemOrder(Item item, int quantity) {
         this.item = item;
         this.quantity = quantity;
    }

    // Returns the total price of the order
    public double getPrice() {
        return item.priceFor(quantity);
    }

    // Returns the item in this order
    public Item getItem() {
        return item;
    }
}
