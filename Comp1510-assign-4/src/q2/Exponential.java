package q2;

/**
 * <p>A program that runs exponential calculations.
 *  It prints the exponential values of x from -10 to 10.</p>
 *
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class Exponential {
    
    /** Constant used in calculations.*/
    private static final int TEN = 10;
    
    /** Constant used in calculations.*/
    private static final int HUND = 100;
        
    /**
     * Drives the program.
     * 
     * @param args command line arguments unused.
     */
    public static void main(String[] args) {

        
        for (int i = -TEN; i <= TEN; i++) {
            
            System.out.println("When x = " + i + " exp^x = " + exp(i));
        }
    }
    
    /** Takes number and returns the exponential value.
     * @param num - double to convert to exponential form.
     * @return results as double.
     */
    public static double exp(double num) {
        
        double results = 1;
        double oldResults = num;
                   
        for (int i = 0; i <= HUND; i++) {
            
            oldResults = oldResults * (num / (i + 1));
            results += oldResults;
        }
         
        return results;
    }
}
