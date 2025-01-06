/**
 * 
 */

package ca.bcit.comp1510.lab04;

import java.util.Scanner;


/** Class: IntegerWrapper - Shows the application of integer wrapper class.
 * @author Tas
 * @version 1.0
 *
 */
public class IntegerWrapper {

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int input;
        String input1;
        String input2;
        int num1;
        int num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer.");
        input = scan.nextInt();
        System.out.println("Binary representation: " 
            + Integer.toBinaryString(input));
        System.out.println("Octal representation: " 
            + Integer.toOctalString(input));
        System.out.println("Hexadecimal representation: " 
            + Integer.toHexString(input));
        System.out.println("Minimum possible Java integer value: " 
            + Integer.MIN_VALUE);
        System.out.println("Maximum possible Java integer value: " 
            + Integer.MAX_VALUE);
        
        System.out.println("Enter 2 Integer values, one per line.");
        input1 = scan.next();
        input2 = scan.next();
        num1 = Integer.parseInt(input1);
        num2 = Integer.parseInt(input2);
        input = num1 + num2;
        
        System.out.println("Sum of 2 integers: " + input);
        
        scan.close();
    }

}
