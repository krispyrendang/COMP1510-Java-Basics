package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/** Driver program for running the random walker class.
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class TestWalker {
    
    /** Constant used for the program.*/
    public static final int TEN = 10;
    
    /** Constant used for the program.*/
    public static final int FIVE = 5;
    
    /** Constant in hex notation used for the program.*/
    public static final int CEIGHT = 200;

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int maxWalk = TEN;
        int bounds = FIVE;
        RandomWalker walk1 = new RandomWalker(maxWalk, bounds);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Max steps and boundary size.");
        RandomWalker walk2 = new RandomWalker(scan.nextInt(), scan.nextInt());

        
        System.out.println(walk1.toString() + walk2.toString());
        
        for (int i = 0; i < FIVE; i++) {
            walk1.takeStep();
            walk2.takeStep();
            System.out.println(walk1.toString() + walk2.toString());
            System.out.println("Distance from origin for walk1: " 
                + walk1.getMDist() + "\nDistance from origin for walk2: " 
                + walk2.getMDist());
        }
        
        RandomWalker walk3 = new RandomWalker(CEIGHT, TEN);
        
        System.out.println(walk3.toString() 
            + "\nDistance from origin for walk3: " + walk3.getMDist());
        walk3.walk();
        System.out.println(walk3.toString() 
            + "\nDistance from origin for walk3: " + walk3.getMDist());
        scan.close();
    }

}
