package ca.bcit.comp1510.lab11;

/** Initialize an item constructor. 
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class Item {
    
    /** name of the item. */
    private String itemName;
    
    /** price of the item. */
    private double itemPrice;
    
    /** purchase quantity of the item. */
    private int itemQty;
    
    /** Initialize the instance variable in the constructor.
     * @param name - String name of the item.
     * @param price - double price of the item.
     * @param qty - integer quantity of the item.
     */
    public Item(String name, double price, int qty) {
        itemName = name;
        itemPrice = price;
        itemQty = qty;
    }
    
    /** Initialize the instance variable in the constructor.
     * @param name - String name of the item.
     * @param price - double price of the item.
     */
    public Item(String name, double price) {
        itemQty = 1;
    }
    
    /** Returns the name of item.
     * @return itemName as string.
     */
    public String getItemName() {
        
        return itemName;
    }
    
    /** Returns the name of item.
     * @return itemPrice as double.
     */
    public double getItemPrice() {
        
        return itemPrice * itemQty;
    }
    
    /** Returns the purchase quantity of item.
     * @return itemQty as integer.
     */
    public double getItemQty() {
        
        return itemQty;
    }

    /**
     * Returns the item description as a String.
     * @return String - item description
     */
    public String toString() {
        
        return "\nitem: " + getItemName() + "\nprice: $" 
            + getItemPrice() + "\nPurchased: " + getItemQty();
    }

}
