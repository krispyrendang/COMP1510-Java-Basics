package ca.bcit.comp1510.lab04;

import java.util.Scanner;

//import ca.bcit.comp1510.ch04.Die;

/** Drives the MultiDie class based on user input for number of die faces.
 * @author Tas
 * @version 1.0
 */
public class RollingMultiDice {

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        MultiDie die1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of die sides");
        int sides = scan.nextInt();
        
        die1 = new MultiDie(sides);
        System.out.println("Die Value = " + die1);
        
        scan.close();
    }

}
