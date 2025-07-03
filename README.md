# 🛒 Java Shopping Cart Backend
This project is a Java-based backend system for a simple shopping cart application, developed as an assignment using principles from Building Java Programs (5th Edition). The backend connects with a provided GUI to allow users to order items, calculate total prices, and apply discounts.

# 💡 Features
* Item support with optional bulk pricing (e.g., 10 for $5.00) 
* Total price calculation per order and across a shopping cart
* GUI integration using Swing
* 10% discount option for the entire order
* Input validation for negative prices or quantities
* Clear object-oriented design (composition over inheritance)
* Uses NumberFormat.getCurrencyInstance() for formatted prices

# 🧱 Class Breakdown
`Item.java`

* Stores item name and pricing (single and optional bulk).

* Methods:

  + priceFor(quantity): Calculates total price using bulk if applicable.

  + toString(): Displays pricing and bulk info.
  
  + equals(): Compares items by name and price.

Catalog.java
* A named collection of Item objects.

* Methods: add(item), get(index), size(), getName()

ItemOrder.java
* Represents an order for a single item and quantity.

* Methods:

  + getPrice(): Uses Item.priceFor()

  + getItem()

ShoppingCart.java
- Stores a list of ItemOrder objects.

- Methods:

  • add(itemOrder): Replaces order if item already exists.

  • setDiscount(boolean): Enables/disables a 10% discount.

  • getTotal(): Computes total order price with optional discount.

# 🖥️ GUI Integration
Two provided files, ShoppingFrame.java and ShoppingMain.java, create a Swing-based interface to interact with the backend:

- Add/update items in cart

- See real-time total cost updates

- Toggle discount option

# 🧪 How I Built It
- Developed and tested each class separately with print statements and test code.

- Ensured object behavior followed best practices from the textbook (e.g., .equals(), encapsulation).

- Used ArrayList for data storage without extending it, favoring composition.
