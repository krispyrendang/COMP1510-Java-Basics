package ca.bcit.comp1510.lab05;

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
        String first;
        String middle;
        String last;
        Name fullName;
        int n;
        
        first = "taswinder";
        middle = "singh";
        last = "dhaliwal";
        fullName = new Name(first, middle, last);
        System.out.println("Name length:" + fullName.nameLength());
        System.out.println("Initials in uppercase:" + fullName.uppercase());
        System.out.println("Name length:" + fullName.nameLength());
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter which index character to extract from name");
        n = scan.nextInt();
        System.out.println("Nth character in name:" + fullName.index(n));
        System.out.println("Name with last name going first:" 
            + fullName.orderLast());
        System.out.println("Matching First Name:" 
            + fullName.comFirstName(first));
        System.out.println("Matching Full Name:" 
                + fullName.comFullName(fullName));

   
        scan.close();
    }

}
