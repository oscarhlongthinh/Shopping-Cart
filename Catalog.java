// OSCAR HUA
// ASSIGNMENT 1
// IT CS 143
// This program simulates a shopping cart system. It defines classes for items, item orders,
// catalogs, and a shopping cart, with a graphical interface for users to select items and
// see totals with or without discounts.

import java.util.*;

public class Catalog {

    private ArrayList<Item> items;
    private String name;
    
    // Constructs a catalog with the given name
    public Catalog(String name) {
         this.name = name;
         this.items = new ArrayList<Item>();
    }
    
    // Adds an item to the catalog
    public void add(Item next) {
         items.add(next);
    }
    
    // Returns the number of items in the catalog
    public int size() {
        return items.size();
    }

    // Returns the item at the given index
    public Item get(int index) {
        return items.get(index);
    }

    //  Returns the name of the catalog
    public String getName() {
        return name;
    }
}
