/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/** Dice - Generating random numbers.
 * 
 * @author Tas
 * @version 1.0
 */
public class Dice {
    
    /** Declaring constant - four sided die.
     */
    static final int FOUR = 4;

    /** Declaring constant - six sided die.
     */
    static final int SIX = 6;
    
    /** Declaring constant - eight sided die.
     */
    static final int EIGHT = 8;
    
    /** Declaring constant - ten sided die.
     */
    static final int TEN = 10;
    
    /** Declaring constant - twelve sided die.
     */
    static final int TWELVE = 12;
    
    /** Declaring constant - twenty sided die.
     */
    static final int TWENTY = 20;


    /** Drives the program.
     * @param args unused
     */
    
    public static void main(String[] args) {
        
        int fourSided;
        int sixSided;
        int eightSided;
        int tenSided;
        int twelveSided;
        int twentySided;
        int sumOfRoll;
        
        Random random = new Random();
        
        fourSided = random.nextInt(FOUR) + 1;
        sumOfRoll = fourSided;
        
        sixSided = random.nextInt(SIX) + 1;
        sumOfRoll = sumOfRoll + sixSided;
        
        eightSided = random.nextInt(EIGHT) + 1;
        sumOfRoll = sumOfRoll + fourSided;
        
        tenSided = random.nextInt(TEN) + 1;
        sumOfRoll = sumOfRoll + tenSided;
        
        twelveSided = random.nextInt(TWELVE) + 1;
        sumOfRoll = sumOfRoll + twelveSided;
        
        twentySided = random.nextInt(TWENTY) + 1;
        sumOfRoll = sumOfRoll + twentySided;
        
        System.out.println("4-sided die: " + fourSided);
        System.out.println("6-sided die: " + sixSided);
        System.out.println("8-sided die: " + eightSided);
        System.out.println("10-sided die: " + tenSided);
        System.out.println("12-sided die: " + twelveSided);
        System.out.println("20-sided die: " + twentySided);
        System.out.println("Total roll: " + sumOfRoll);

    }

}
