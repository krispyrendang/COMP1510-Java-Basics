package q5;

import java.util.Scanner;

/**
 * <p>DiscountCalculator - calculates discounts for customers.
 * </p>
 *
 * @author Tas
 * @version 1.0
 */
public class DiscountCalculator {
    
    /** Constant used in calculations.*/
    static final double MAX = 75;

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments unused.
     */
    public static void main(String[] args) {
        int cheese;
        int referral;
        int discount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of cheese bought");
        cheese = scan.nextInt();
        System.out.println("Enter number of new customer referrals");
        referral = scan.nextInt();
        
        discount = cheese + referral;
        System.out.println("Total discount: " + Math.min(discount, MAX) 
            + " %");

        scan.close();
    }

}
