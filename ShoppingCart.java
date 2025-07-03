// OSCAR HUA
// ASSIGNMENT 1
// IT CS 143

import java.util.*;

public class ShoppingCart {

    public static final double DISCOUNT_PERCENT = 0.9;
    
    private ArrayList<ItemOrder> orders;
    private boolean hasDiscount;

    // Constructs an empty shopping cart
    public ShoppingCart() {
         orders = new ArrayList<ItemOrder>();
         hasDiscount = false;
    }

    // Adds or replaces an item order in the cart
    public void add(ItemOrder next) {
         for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getItem().equals(next.getItem())) {
               orders.set(i, next);
               return;
            }
         }
         orders.add(next);
    }

    // Sets the discount flag
    public void setDiscount(boolean discount) {
         hasDiscount = discount;
    }

    // Calculates the total price for the cart
    public double getTotal() {        
        double total = 0.0;
        for (ItemOrder order : orders) {
            total += order.getPrice();
        }
        if (hasDiscount) {
            total *= DISCOUNT_PERCENT;
        }
        return total;
    }
}
