package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/** NameDriver - runs the program class Name.
 * @author Tas
 * @version 1.0
 *
 */
public class NameDriver {

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Name name1;
        Name name2;
        Name name3;
        int n;
        Scanner scan = new Scanner(System.in);

        
        //First Middle and Last name entry
        name1 = new Name("tom", "harry", "jones");
        System.out.println("Entry with first, middle and last name:" 
                + name1.toString());
        System.out.println();
        
        
        //Middle only name entry
        name2 = new Name("", "harry", "    ");
        System.out.println("Entry with only middle name:" 
                + name2.toString());
        System.out.println("Name length:" + name2.nameLength()
            + "\nEnter which index character to extract from name");
        n = scan.nextInt();
        System.out.println("Nth character in name:" + name2.getCharacter(n));
        System.out.println("Name with last name going first:" 
            + name2.orderLast());
        System.out.println();
        
        //First and Last only name entry
        name3 = new Name("tom", "      ", "jones");
        System.out.println("Entry with first and last name:" 
                + name3.toString());
        System.out.println("Name length:" + name3.nameLength() 
            + "\nEnter which index character to extract from name");
        n = scan.nextInt();
        System.out.println("Nth character in name:" + name3.getCharacter(n));
        System.out.println("Name with last name going first:" 
            + name3.orderLast());
        
   
        scan.close();
    }

}
