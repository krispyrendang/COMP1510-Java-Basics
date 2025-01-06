package q2;

import java.util.Scanner;

/** Blow - calculates volume of a balloon after inflation.
 * @author Tas
 * @version 1.0
 *
 */
public class Blow {

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        double amount;
        Balloon balloon;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value to inflate a balloon.");
        amount = scan.nextDouble();
        balloon = new Balloon();
        balloon.inflate(amount);
        System.out.println("Inflated value is:" + balloon.getVolume());
        
        
        scan.close();
    }

}
