package q1;

import java.util.Scanner;

/**
 * This program converts the monetary value input by the user into the number 
 * of dollar bills and coins representing it.
 *
 * @author Taswinder
 * @version 1.0
 */
public class Change {

    /** Declaring constant - value of a ten dollar bill.*/
    static final int TEN = 10;
    
    /** Declaring constant - value of a five dollar bill.*/
    static final int FIVE = 5;
    
    /** Declaring constant - value of 1 toonie.*/
    static final int TOON = 2;
    
    /** Declaring constant - value of 1 loonie.*/
    static final int LOON = 1;
    
    /** Declaring constant - value of 1 quarter.*/
    static final double QUARTER = 0.25;
    
    /** Declaring constant - value of 1 dime.*/
    static final double DIME = 0.10;
    
    /** Declaring constant - value of 1 nickle.*/
    static final double NICKLE = 0.05;
    
    /** Declaring constant - value of 1 penny.*/
    static final double PENNY = 0.01;
    
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    
    public static void main(String[] args) {
        double userInput;
        int tenBills;
        int fiveBills;
        int toonies;
        int loonies;
        int quarters;
        int dimes;
        int nickles;
        int pennies;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input total amount of money.");
        userInput = scan.nextDouble();
        
        tenBills = (int) (userInput / TEN);
        userInput = userInput % TEN;   
        System.out.println(tenBills + " ten dollar bills");
        
        fiveBills = (int) (userInput / FIVE);
        userInput = userInput % FIVE;   
        System.out.println(fiveBills + " five dollar bills");
        
        toonies = (int) (userInput / TOON);
        userInput = userInput % TOON;   
        System.out.println(toonies + " toonies");
        
        loonies = (int) (userInput / LOON);
        userInput = userInput % LOON;   
        System.out.println(loonies + " loonies");
        
        quarters = (int) (userInput / QUARTER);
        userInput = userInput % QUARTER;   
        System.out.println(quarters + " quarters");
        
        dimes = (int) (userInput / DIME);
        userInput = userInput % DIME;   
        System.out.println(dimes + " dimes");
        
        nickles = (int) (userInput / NICKLE);
        userInput = userInput % NICKLE;   
        System.out.println(nickles + " nickles");
        
        pennies = (int) (userInput / PENNY);
        userInput = userInput % PENNY;   
        System.out.println(pennies + " pennies");
        
        scan.close();
    }

}
