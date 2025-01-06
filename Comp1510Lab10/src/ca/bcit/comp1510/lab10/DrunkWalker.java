package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/** Simulates a drunk walker until the walker
 *  goes out of bounds.
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class DrunkWalker {

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Max steps and boundary size.");
        int steps = scan.nextInt();
        int bounds = scan.nextInt();
        
        System.out.println("Number of simulations to run.");
        int runs = scan.nextInt();
        int falls = 0;
        
        for (int i = 0; i < runs; i++) {
            RandomWalker drunk = new RandomWalker(steps, bounds);
            drunk.walk();
            if (drunk.moreSteps()) {
                falls++;                
            }
            
        }
        
        System.out.println("Total simulations: " + runs 
            + "\nTotal falls: " + falls);
        
        scan.close();
    }

}
