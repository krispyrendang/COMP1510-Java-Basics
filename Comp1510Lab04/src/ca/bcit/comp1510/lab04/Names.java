/**
 * 
 */

package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/** Drives the class Name.
 * @author Tas
 * @version 1.0
 *
 */
public class Names {

    /** Ask for user name and calls the class Name to assign it.
     * @param args unused.
     */
    public static void main(String[] args) {
        String first;
        String middle;
        String last;
        Name fullName;
        System.out.println("Enter your name (first name, "
            + "middle name, last name):");
        Scanner scan = new Scanner(System.in);
        first = scan.next();
        middle = scan.next();
        last = scan.next();
        fullName = new Name(first, middle, last);
        first = fullName.getFirstName().substring(0, 1).toUpperCase() 
            + fullName.getFirstName().substring(1);
        middle = fullName.getMidName().substring(0, 1).toUpperCase() 
                + fullName.getMidName().substring(1);
        last = fullName.getLastName().substring(0, 1).toUpperCase() 
                + fullName.getLastName().substring(1);
        
        fullName.setFirstName(first);
        fullName.setMidName(middle);
        fullName.setLastName(last);

        System.out.println("Full Name: " + fullName.toString());
        
        scan.close();
    }

}
