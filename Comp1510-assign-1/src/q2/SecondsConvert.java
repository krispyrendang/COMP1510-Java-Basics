package q2;

import java.util.Scanner;

/**
 * This program converts the user input of hours, minutes and 
 * seconds into total number of seconds. It displays the results.
 *
 * @author Taswinder
 * @version 1.0
 */
public class SecondsConvert {
    /** Declaring constant - number of seconds in 1 hour.*/
    static final int HOUR = 3600;
    
    /** Declaring constant - number of seconds in 1 minute.*/
    static final int MINUTE = 60;
    
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hr;
        int mins;
        int secs;
        
        System.out.println("Please enter the number of hours, "
            + "minutes and seconds to be converted.");
        hr = scan.nextInt();
        mins = scan.nextInt();
        secs = scan.nextInt();
        
        secs = secs + hr * HOUR + mins * MINUTE;
        System.out.println("Total number of seconds "
            + "after conversions is " + secs);
        
        scan.close();
    }

}
