/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Scanner;

import java.text.DecimalFormat;

/** Distance - Measurement between 2 points.
 * @author Tas
 * @version 1.0
 */
public class Distance {

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the x and y coordinates of Point 1. " 
                + "Leave a space between x and y values.");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        
        System.out.println("Enter the x and y coordinates of Point 2. " 
                + "Leave a space between x and y values.");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        double result = Math.sqrt((x2 - x1) * (x2 - x1) 
                + (y2 - y1) * (y2 - y1));
        System.out.println("The distance between the 2 points is " + result);
        
        DecimalFormat dec = new DecimalFormat("0.00");
        String formatResult = dec.format(result);
        
        System.out.println("The distance to 2 decimal places is " 
                + formatResult);
        
        scan.close();
    }

}
