package ca.bcit.comp1510.lab11;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;
    
    /** key that locks or unlocks the other methods.*/
    private int keyLock;
    
    /** Status of object if locked or not.*/
    private boolean keyCheck;

    /** Coin's current face showing. */
    private int face;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     * 
     */
    public Coin() {
       
        flip();
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        if (!keyCheck) {
            face = (int) (Math.random() * 2);
        } else {
            System.out.println("Object is locked.");
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == HEADS;
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        String faceName;
        
        if (locked()) {
            faceName = "object is locked.";
        } else {
            flip();
            if (face == HEADS) {
                faceName = "Heads";
            } else {
                faceName = "Tails";
            }
        }

        return faceName;
    }

    /** Assigns the key (password) used to unlock the methods.
     * @param key - integer value of the key.*/
    public void setKey(int key) {
        keyLock = key;
        
    }

    /** Locks the implementing object. 
     * If the correct key is provided, 
     * returns true if the object was locked.
     * @param key - integer value of the key. 
     * @return boolean status of the lock.
     * */
    public boolean lock(int key) {
        keyCheck = (key == keyLock);
        return (key == keyLock);                
    }

    /** Unlocks the implementing object. 
     * If the correct key is provided, 
     * returns true if the object was unlocked.
     * @param key - integer value of the key. 
     * @return boolean status of the lock.
     * */
    public boolean unlock(int key) {
        keyCheck = (key != keyLock);
        return (key == keyLock);
    }

    /** Returns true if the object was locked.
     * @return boolean status of the lock.
     */
    public boolean locked() {
        
        return keyCheck;
    }
}

