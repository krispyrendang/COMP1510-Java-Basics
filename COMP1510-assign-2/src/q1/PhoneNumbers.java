package q1;

import java.util.Scanner;

/**
 * <p>Formats phone numbers contained in a string using parentheses 
 * and dashes.</p>
 *
 * @author Tas
 * @version 1.0
 */
public class PhoneNumbers {
    
    /** Constant used to format phone number.*/
    static final int THREE = 3;
    
    /** Constant used to format phone number.*/
    static final int SIX = 6;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        //Variable to store phone number as string.
        String phone;
        System.out.println("Enter a 10-digit phone number.");
        
        //Creates a scanner object 
        Scanner scan = new Scanner(System.in);
        phone = scan.next();
        
        System.out.println("Formatted phone number: " 
            + phone.substring(0, THREE) + ")" 
            + phone.substring(THREE, SIX) + "-" 
            + phone.substring(SIX));
        
        scan.close();
    }

}
