package ca.bcit.comp1510.lab11;

import java.util.Arrays;

/** Initialize a transaction constructor. 
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class Transaction {
    
    /** Constant used in initializing an Array. */
    private static final int TEN = 10;

    /** number of the itema. */
    private Item[] cart;
    
    /** total price of items in the cart. */
    private double totalPrice;
    
    /** number of items in the cart. */
    private int itemCount;
    
    /** Initialize the instance variable in the constructor.
     * @param qty - Integer number of Item objects in the cart.
     */
    public Transaction(int qty) {
        cart = new Item[qty];
        totalPrice = 0;
        itemCount = 0;
        
        
        
    }
    
    /** Creates an Item object.
     * @param name - String name of the item.
     * @param price - double price of the item.
     * @param qty - integer quantity of the item.
     */
    public void addToCart(String name, double price, int qty) {
        Item item1 = new Item(name, price, qty);
        cart[itemCount] = item1;
        System.out.println(item1.getItemName());
        System.out.println(cart[0].getItemName());

        System.out.println("item count: " + itemCount);
        
        totalPrice += item1.getItemPrice();
        itemCount++;
    }
    
    /** Adds an Item object to the cart.
     * @param obj - Item object.
     */
    public void addToCart(Item obj) {
        cart[itemCount] = obj;
        totalPrice += obj.getItemPrice();
        itemCount++;
    }
    
    /** Checks the array of objects in the cart and increase size.
     */
    public void increaseSize() {
        if (itemCount == cart.length) {
            Item[] newCart = Arrays.copyOf(cart, TEN + 1 + 1 + 1);  
            cart = newCart;
        }
    }
    
    /** Returns the total price of all items inside the cart.
     * @return totalPrice as integer.
     */
    public double getTotalPrice() {
        totalPrice = 0;
        
        for (int i = 0; i < itemCount; i++) {
            totalPrice += cart[i].getItemPrice();
            
        }
        
        return totalPrice;
    }
    
    /** Returns total number of all the items in the cart.
     * @return totalCount as integer.
     */
    public int getCount() {
        int totalCount = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCount += cart[i].getItemQty();
        }

        return totalCount;
    }
    
    /**
     * Returns the cart description as a String.
     * @return String - cart description
     */
    public String toString() {
        String results = "";
        
        for (int i = 0; i < itemCount; i++) {
            results += cart[i].toString();
        }
        
        results += "\n\nTotal Price: $" + getTotalPrice();
        
        return results;
    }
    
}
