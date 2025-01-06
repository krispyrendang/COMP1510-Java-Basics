package ca.bcit.comp1510.lab11;

/** CoinFlip - flips coin 100 times and detects a trend.
* @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class CoinFlip {
    
    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int correctKey = 1;
        int testKey1 = 1;
        int testKey2 = -1;
        Coin coin1 = new Coin();
        coin1.setKey(correctKey);
        
       
        //Using a correct key.
        coin1.unlock(testKey1);
        System.out.println("Unlocking a coin with the correct key: " 
                + coin1.toString());
        coin1.lock(testKey1);
        System.out.println("Locking a coin with the correct key: " 
            + coin1.toString());
        
        
        //Using an incorrect key.
        coin1.unlock(testKey2);
        System.out.println("Unlocking a coin with the wrong key: " 
                + coin1.toString());
        coin1.unlock(testKey1);
        coin1.lock(testKey2);
        System.out.println("Locking a coin with the wrong key: " 
            + coin1.toString());      

    }
        
}
