package ca.bcit.comp1510.lab11;

/** Runs a shopping program. 
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class Shopping {
    
    /** Constant used in initializing an Array. */
    private static final int TEN = 10;
    
    /** Constant used in transaction. */
    private static final double TWOFIFTY = 2.50;
    
    /** Constant used in transaction. */
    private static final int EIGHT = 8;
    

    /** Drives the item and transactions program.
     * @param args unused.
     */
    public static void main(String[] args) {
        String name = "apples";
        double price = TWOFIFTY;
        int qty = EIGHT;
        
        Transaction shop = new Transaction(1);

        shop.addToCart(name, price, qty);
        System.out.println("Total items in cart: " + shop.getCount());
        System.out.println(shop.toString());
        
        name = "lettuce";
        price = 1;
        qty = 2;
        
        shop.increaseSize();
        shop.addToCart(name, price, qty);
        System.out.println("Total items in cart: " + shop.getCount());
        System.out.println(shop.toString());
        
        name = "carrots";
        price = TWOFIFTY;
        qty = TEN;
        
        shop.addToCart(name, price, qty);
        System.out.println("Total items in cart: " + shop.getCount());
        System.out.println(shop.toString());
                
    }

}
