package ca.bcit.comp1510.lab11;

/** An interface that test rules on locking a program that implements it.
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public interface Lockable {

    /** Assigns the key (password) used to unlock the methods.
     * @param key - integer value of the key.*/
    void setKey(int key);
    
    /** Locks the implementing object. 
     * If the correct key is provided, 
     * returns true if the object was locked.
     * @param key - integer value of the key. 
     * @return boolean status of the lock.
     * */
    boolean lock(int key);
    
    /** Unlocks the implementing object. 
     * If the correct key is provided, 
     * returns true if the object was unlocked.
     * @param key - integer value of the key. 
     * @return boolean status of the lock.
     * */
    boolean unlock(int key);
    
    /** Returns true if the object was locked.
     * @return boolean status of the lock.
     */
    boolean locked();
    
    
}
