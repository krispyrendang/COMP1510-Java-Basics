package ca.bcit.comp1510.lab04;

/** Represents one die (singular of dice) with faces showing 
 *  values determined by user from the driver class.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class MultiDie {
    /** Maximum face value. 
     * 
     *  1. No for getters setters. max is final and does not need setter.
     *  max is not static and may be called using a getter.
     *  <p>
     *  2. Yes, it is possible for getters, not for setters.
     *  <p>
     *  3. Yes, makes sense. This will ensure max value does not 
     *  get changed unknowingly and affecting the output.
     *  <p>
     *  4. It says that its value cannot be changed inside the object MultiDie 
     *  and can only be assigned through the driver class.
     *  <p>
     *  5. No.
     *  */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;
    

    
    /**
     * Constructor sets the initial face value to 1.
     * @param numSides - number of sides
     */
    public MultiDie(int numSides) {
        max = numSides;
        faceValue = roll();
        
    }

    
    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}

