package ca.bcit.comp1510.lab09;

/** CoinRunner - flips coin 100 times and detects a trend.
 * @author Tas
 * @version 1.0
 */
public class CoinRunner {

    /** Constant used for the program.*/
    public static final int HUNDRED = 100;
    
    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Coin runner = new Coin();
        int heads = 0;
        int count = 0;
        for (int i = 0; i < HUNDRED; i++) {
            runner.flip();
            System.out.println(runner);
            if (runner.isHeads()) {
                count++;
            } else if (count >= heads) {
                heads = count;
                count = 0;
            } else {
                count = 0;
            }
        }
        
        System.out.println("The longest run of heads is " + heads);

    }

}
