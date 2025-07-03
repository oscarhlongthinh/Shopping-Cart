// OSCAR HUA
// ASSIGNMENT 1
// IT CS 143

import java.text.*;

public class Item {
    private double price;
    private double bulkPrice;
    private NumberFormat formatter;
    private String name;
    private int bulkQuantity;

    // Constructs an item with name and price
    public Item(String name, double price) {
         if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
         }
         this.name = name;
         this.price = price;
         this.bulkQuantity = 0;
         this.bulkPrice = 0.0;
    }

    // Constructs an item with bulk pricing
    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
         if (price < 0 || bulkQuantity < 0 || bulkPrice < 0) {
            throw new IllegalArgumentException("Value cannot be negative.");
         }
         this.name = name;
         this.price = price;
         this.bulkQuantity = bulkQuantity;
         this.bulkPrice = bulkPrice;
    }

    // Returns the total price for the given quantity
    public double priceFor(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        if (bulkQuantity > 0 && quantity >= bulkQuantity){
            int bulkGroups = quantity / bulkQuantity;
            int remainder = quantity % bulkQuantity;
            return bulkGroups * bulkPrice + remainder * price;
        } else {
            return quantity * price;
        }
    }

    // Returns a string representation of the item
    public String toString() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String result = name + ", " + nf.format(price);
        if (bulkQuantity > 0) {
            result += " (" + bulkQuantity + " for " + nf.format(bulkPrice) + ")";
        }
        return result;
    }
    
    // Compares this item to another for equality based on name and price
    public boolean equals(Object o) {
      if (o instanceof Item) {
         Item other = (Item) o;
         return name.equals(other.name) && price == other.price;
      } else {
         return false;
      }
    }
}
