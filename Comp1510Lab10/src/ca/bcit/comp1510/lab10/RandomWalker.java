package ca.bcit.comp1510.lab10;

import java.util.Random;

/** Program that simulates a drunk person walking.
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class RandomWalker {
    
    /** Constant used for the program.*/
    public static final int TWO = 2;
    
    /** Constant used for the program.*/
    public static final int THREE = 3;
    
    /** Constant used for the program.*/
    public static final int FOUR = 4;
    
    /** The x coordinate of the current position.*/
    private int posX;
    
    /** The y coordinate of the current position.*/
    private int posY;
    
    /** The maximum number of steps in the walk.*/
    private int maxSteps;
    
    /** The current number of steps taken.*/
    private int currentSteps;
    
    /** The boundary of the square the walker inhabits.*/
    private int bounds;
    
    /** The distance of the walker from the origin.*/
    private int maximumDistance;
    
    /** Constructor for taking in maximum steps in a 
     *  walk and the space boundary.
     * @param maxWalk - max steps as integer.
     * @param limit - space boundary as integer.
     */
    public RandomWalker(int maxWalk, int limit) {
        maxSteps = maxWalk;
        bounds = limit;
        posX = 0;
        posY = 0;
        currentSteps = 0;
        maximumDistance = 0;
        
        
    }
    
    /** Constructor for taking in maximum steps in a 
     *  walk, x/y coordinates and the space boundary.
     * @param maxWalk - max steps as integer.
     * @param limit - space boundary as integer.
     * @param x - x-coordinates as integer.
     * @param y - y-coordinates as integer.
     */
    public RandomWalker(int maxWalk, int limit, int x, int y) {
        currentSteps = 0;
        maximumDistance = 0;
        
        
    }
    
    /** Simulates taking a single step in any 
     *  one of 4 directions.*/
    public void takeStep() {
        Random rand = new Random();
        int steps = rand.nextInt(FOUR);     
        currentSteps += 1;
        
        switch (steps) {
            case 1:
                posX += 1;
                break;
            case TWO:
                posX -= 1;
                break;
            case THREE:
                posY += 1;
                break;
            default:
                posY -= 1;
        }    
        
        maximumDistance = max(posX, posY);
    }
    
    /** Checks if number of steps taken is less than the 
     * max steps allowed.
     *  @return boolean value if the check is true.*/
    public boolean moreSteps() {
        return (currentSteps < maxSteps);
    }
    
    /** Checks current coordinates are within its square boundary.
     *  @return boolean value if the check is true.*/
    public boolean inBounds() {
        int check1 = 0 - bounds;
        int check2 = 0 + bounds;
        
        if ((posX <= check2) && (posX >= check1)) {
            if ((posY <= check2) && (posY >= check1)) {
                return true;
            }
        } 
        
        return false;
    }
    
    /** Simulates a random walk using a loop.*/
    public void walk() {
        boolean check1 = moreSteps();
        boolean check2 = inBounds();
        
        
        do {
            takeStep();
            check1 = moreSteps();
            check2 = inBounds();
        } while (check1 && check2);
    }
    
    /** Returns the absolute value of each coordinate.
     * @param a - current x coordinate.
     * @param b - current y coordinate.
     * @return results as integer.
     */
    private int max(int a, int b) {
        int x = Math.abs(a);
        int y = Math.abs(b);
        int results = (x > y) ? x : y;
        
        return results;
    }
    
    /** Returns the value of maximumDistance.
     * @return maximumDistance as integer.
     */
    public int getMDist() {
        
        return maximumDistance;
    }
    
    /** Returns the value of x coordinate.
     * @return posX as integer.
     */
    public int getPosX() {
        
        return posX;
    }
    
    /** Returns the value of y coordinate.
     * @return posY as integer.
     */
    public int getPosY() {
        
        return posY;
    }
    
    /** Returns the information of the RandomWalker object.
     * @return result as a string.
     */
    public String toString() {
        String result = "\nCurrent Steps:\t" + currentSteps 
            + "\nCoordinates:\t" + posX + ", " + posY;

        return result;
    }

}
