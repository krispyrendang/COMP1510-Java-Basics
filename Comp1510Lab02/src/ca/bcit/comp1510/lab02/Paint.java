/**
 * 
 */
package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * @author Tas
 *@version 1.0
 */
public class Paint {

    /**
     * Determines how many cans of paint we need to paint a room.
     * @param args 
     * arguments
     */
    
    static final int COVERAGE = 400;

    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);  
        
        System.out.println("What is the length of the room in feet?");
        int length = myScanner.nextInt();
        System.out.println("What is the width of the room in feet?");
        int width = myScanner.nextInt();
        System.out.println("What is the height of the room in feet?");
        int height = myScanner.nextInt();
        System.out.println("How many coats of paint are needed?");
        int coats = myScanner.nextInt();
        
        double surfaceArea = (length * height * 2) + (width * height * 2) + (length * width);
        double coverageNeeded = surfaceArea * coats;
        double cansOfPaintNeeded = coverageNeeded / COVERAGE;

        System.out.println("Number of cans required: " + Math.ceil(cansOfPaintNeeded));
        
        myScanner.close();
    }

}
