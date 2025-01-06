package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;

/** CatHotel - adds Cat objects to an array.
 * @author Tas
 * @version 1.0
 */
public class CatHotel {
    
    /** Name of hotel passed into the constructor.*/
    private String hotelName;
    
    /** Guest list of Cats staying at the hotel.*/
    private ArrayList<Cat> guestList;
    
    /** Constructor for initializing input variables.
     * @param inputName - name of cat hotel.
     */
    public CatHotel(String inputName) {
        guestList = new ArrayList<Cat>();
        setHotelName(inputName);
        
    }
    
    /** Returns the value of hotelName.
     * @return hotelName as string.
     */
    public String getHotelName() {
        return hotelName;
    }
    
    /** Set the value of hotelName.
     * @param name as string.
     */
    public void setHotelName(String name) {
        hotelName = name;
    }
    
    /** Method to add cat to hotel guest list.
     * @param newCat as object.
     */
    public void addCat(Cat newCat) {
        guestList.add(newCat);
    }
    
    /** Method to remove all cats in the guest list.*/
    public void removeAllGuests() {
        guestList.clear();
    }
    
    /** Returns the total elements in the array list as an integer.
     * @return guests as integer.
     */
    public int guestCount() {
        return guestList.size();
    }
    
    /** Method to check age and remove cats from guest list.
     * @param ageLimit as integer.
     * @return count - sum of evicted cats as integer.
     */
    public int removeOldGuests(int ageLimit) {
        Iterator<Cat> catIterator = guestList.iterator();
        int count = 0;
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            int catAge = temp.getCatAge();
            if (catAge > ageLimit) {
                catIterator.remove();
                count++;
            }        
        }
        return count;        
    }
    
    /** Returns the information of the cat hotel and current guests.*/
    public void printGuestList() {
        System.out.println("Hotel: " + getHotelName());
        for (Cat i : guestList) {
            System.out.println("\n" + i);
        }
    }
    
    
    
    
}
