package ca.bcit.comp1510.lab11;

import java.util.Arrays;

/** Runs a program that passes args to the main method. 
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class Average {

    /** Drives the program.
     * @param args String input from command-line.
     */
    public static void main(String[] args) {
        
        double total = 0;
        double average = 0;
        int count = 0;
        
        if (args == null) {
            System.out.println("No arguments.");
        } else if (args.length == 0) {
            System.out.println("No arguments.");
        } else {
            
            for (int i = 0; i < args.length; i++) {
                total += Integer.parseInt(args[i]);
                count++;
                
            }
            
            average = total / count;
            
        }
        System.out.println("Original Array: " + Arrays.toString(args));
        System.out.println("Average of the numbers in Array: " 
            + average);
        System.out.println("\n" + count + "\n" + args.length);
        

    }

}
