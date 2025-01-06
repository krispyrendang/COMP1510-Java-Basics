package ca.bcit.comp1510.lab09;

import java.util.Random;

/** Manages the guests at the cat hotel.
 * @author Tas
 * @version 1.0
 */
public class CatHotelDriver {
    
    /** Constant used for the program.*/
    public static final int FIFTEEN = 15;
    
    /** Constant used for the program.*/
    public static final int SEVEN = 7;

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        CatHotel hotel1;
        String name = "Cat Hotel";
        hotel1 = new CatHotel(name);
        Random rand = new Random();
        int limit = SEVEN;
        Cat cat1 = new Cat("", rand.nextInt(FIFTEEN) + 1);
        Cat cat2 = new Cat(" ", rand.nextInt(FIFTEEN) + 1);
        Cat cat3 = new Cat("Rex", rand.nextInt(FIFTEEN) + 1);
        Cat cat4 = new Cat("Lou", rand.nextInt(FIFTEEN) + 1);
        Cat cat5 = new Cat("White", rand.nextInt(FIFTEEN) + 1);
        hotel1.addCat(cat1);
        hotel1.addCat(cat2);
        hotel1.addCat(cat3);
        hotel1.addCat(cat4);
        hotel1.addCat(cat5);
        
        System.out.println("Total Guests:" + hotel1.guestCount());
        hotel1.printGuestList();
        hotel1.setHotelName("Hotel California");
        System.out.println("\nGuests removed: " 
            + hotel1.removeOldGuests(limit));
        System.out.println("\nTotal Guests:" + hotel1.guestCount());
        hotel1.printGuestList();
    }

}
