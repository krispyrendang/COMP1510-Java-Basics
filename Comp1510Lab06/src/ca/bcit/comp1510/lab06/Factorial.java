package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/** Factorial - program that calculates product of integers between 1 and n.
 * @author Tas
 * @version 1.0
 */
public class Factorial {

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        int fact;
        int count;
        int check;
        
        //Initializing variables
        fact = 1;
        check = -1;
        count = 1;
        input = 1;
        
        //Loop for checking
        while (check < 0) {
            System.out.println("Enter a positive integer to factorise.");
            
            //Check for Non-Integers
            if (!scan.hasNextInt()) {
                System.out.println("Not a valid integer.");
                scan.next();

            } else {
                
                input = scan.nextInt();
                count = input;
                
                //Check for Positive Integers
                if (count < 0) {
                    System.out.println("Not a positive integer.");
                    
                } else {
                    
                    //End the loop
                    check = 1;
                }
            } 
            
        }
        
                
        //Factorial calculation
        while (count > 0) {
            fact *= count;
            count--;            
        }

        System.out.println("Factorial of " + input + " is " + fact);
        
        scan.close();

    }
    
        
}
