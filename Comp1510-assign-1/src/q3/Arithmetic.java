package q3;

import java.util.Scanner;

/**
 * This program determines the quotient and remainder from dividing 
 * 2 numbers input by the user. It goes on to do more calculations 
 * and displays all the values.
 *
 * @author Taswinder
 * @version 1.0
 */
public class Arithmetic {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        int a;
        int b;
        double q;
        double r;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter values of a and b");
        a = scan.nextInt();
        b = scan.nextInt();
        q = a / b;
        r = a % b;
        
        System.out.println(a + ", " + b + ", " + q + ", " 
            + r + ", " + (q * b + r));
        
        scan.close();
    }

}
