package q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/** <p>Program that determines prime numbers. 
 * It uses the Sieve of Eratosthenes to calculate the results. </p>
 *
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class Primes {
    
    /** Boolean array list containing prime numbers.*/
    private List<Boolean> primes;
        
    /** Constructor for initializing input variables.
     * @param inputN - sets the maximum index for the array list.
     */
    public Primes(int inputN) {
        primes = new ArrayList<Boolean>(inputN);
        calculatePrimes(inputN);
        
        
    }
    
    /** Use the Sieve of Eratosthenes to determine prime indices.
     * @param index - takes in the maximum index - integer.
     */
    private void calculatePrimes(int index) {
        int i;
        int j;
        int m = 0;
        boolean result = false;
        int check = 0;      
        m = index;
        
        for (j = 2; j < index; j++) {
            result = false;  
            m = j / 2;      
 
            for (i = 2; i <= m; i++) {      
                if (j % i == 0) {
                    primes.set(j, result);
                    check = 1;      
                    break;                  
                }
                     
            }      
        }      
                  
        if (check == 1) {
            result = true;
            primes.set(j, result);
        }
    }
    
    /** Prints out the list of primes calculated.
     *  @return result - returns all prime numbers as a string.
     * */
    public String printPrimes() {
        String result = "";
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                result += (" " + i);
            }
        } 
        
        return result;
    }
    
        
    /** Counts the number of primes calculated.
     *  @return result - number of prime numbers as integer.
     */
    public int countPrimes() {
        int result = 0;
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                result++;
            }
        }
        
        return result;
    } 
    
    /** Checks if a number is a prime.
     *  @param x - integer passed in to check if it is a prime.
     *  @return result - returns a boolean value as a result.
     */
    public boolean isPrime(int x) {
        boolean result;
        result = ((primes.get(x) ? true : false));
        return result;
    }
    
    
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments is unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program uses the sieve of Eratosthenes "
            + "to determine which numbers are prime.\r\n"
            + "Enter an upper bound:");
        int inputN;
        do {
            inputN = scan.nextInt();
            if (inputN <= 1) {
                System.out.println("Invalid entry. "
                    + "Enter a number above 1.");
            }
        } while (inputN < 1);
        
        
        Primes primes1 = new Primes(inputN);
        System.out.println("There are " + primes1.countPrimes() + " primes:");
        System.out.println("The prime numbers between 0 and " + inputN 
            + " are:\n" + primes1.printPrimes());
        
        
        
        scan.close();
    }

}
