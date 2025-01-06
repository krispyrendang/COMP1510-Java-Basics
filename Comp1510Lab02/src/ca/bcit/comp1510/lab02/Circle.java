/**
 * 
 */
package ca.bcit.comp1510.lab02;
import java.util.Scanner;

/**
 * @author Tas
 * @version 1.0
 *
 */
public class Circle {

    /**
     * Calculates the circumference and radius of a circle.
     * @param args 
     * arguments
     */
    public static void main(String[] args) {
        double PI = 3.14159;
        double radius;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        radius = myScanner.nextDouble();
        
        double doubleRadius = radius *2;
        
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;       
        
        double doubleCircumference = 2 * PI * doubleRadius;
        double doubleArea = PI * doubleRadius * doubleRadius;
        
        double compareCircumference = doubleCircumference / circumference;
        double compareArea = doubleArea / area;

        
        System.out.println("Circumference of circle with radius " + radius + " is: " + circumference + ".");
        System.out.println("Area of circle with radius " + radius + " is: " + area + ".");
        
        System.out.println("The circumference increases by " + compareCircumference + " times when the radius is doubled.");
        System.out.println("The area increases by " + compareArea + " times when the radius is doubled.");
        
        myScanner.close();
    }

}
