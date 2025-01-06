package q4;

import java.util.Scanner;

/**
 * This program calculates an approximation to the square root of the user 
 * input (double) value. This calculation holds true for all input values 
 * greater or equal to positive 1.
 *
 * @author Taswinder
 * @version 1.0
 */
public class Sqrt {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        double a;
        double s;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Squareroot of: (Enter a number)");
        a = scan.nextDouble();
        s = (a + 1) / 2;
        System.out.println(s);
        
        s = (s + a / s) / 2;
        System.out.println(s);

        s = (s + a / s) / 2;
        System.out.println(s);
        
        s = (s + a / s) / 2;
        System.out.println(s);
        
        s = (s + a / s) / 2;
        System.out.println(s);
        
        s = (s + a / s) / 2;
        System.out.println(s);
        
        s = (s + a / s) / 2;
        System.out.println(s);
        
        s = (s + a / s) / 2;
        System.out.println(s);
        
        s = (s + a / s) / 2;
        System.out.println(s);
        
        s = (s + a / s) / 2;
        System.out.println(s);
        
        scan.close();
    }

}
