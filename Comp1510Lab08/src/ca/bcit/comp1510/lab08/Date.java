package ca.bcit.comp1510.lab08;

import java.util.Scanner;


/** Represent a valid Gregorian date on or after 24 February 1582.
 * @author blink
 * @version 1.0
 */
public class Date {
    
    /** Constant used for validation.*/
    static final int FOUR = 4;
    
    /** Constant used for validation.*/
    static final int EIGHT = 8;
    
    /** Constant used for validation.*/
    static final int THIRTEEN = 13;
    
    /** Constant used for validation.
     *  Hexadecimal name.*/
    static final int ONEC = 28;
    
    /** Constant used for validation.
     *  Hexadecimal name.*/
    static final int ONED = 29;
    
    /** Constant used for validation.
     *  Hexadecimal name.*/
    static final int ONEE = 30;
    
    /** Constant used for validation.
     *  Hexadecimal name.*/
    static final int ONEF = 31;
    
    /** Constant used for validation.
     *  Hexadecimal name.*/
    static final int SIXFOUR = 100;
    
    /** Constant used for validation.
     *  Hexadecimal name.*/
    static final int ONENINETY = 400;
    
    /** Constant used for validation.
     *  Hexadecimal name.*/
    static final int SIXTWOD = 1581;
    
    /** Constant used for validation.
     *  Hexadecimal name.*/
    static final int BBEIGHT = 3000;
    
    /** Constant used for date validation.*/
    static final int DATECHECK = 2241582;
    
    /** day of month.  1 .. max days in month */
    private static int day;
    
    /** month of year.  1 .. 12 */
    private static int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private static int year;
    
    /** Validates for date input.
     * @param theDay - input day as integer
     * @param theMonth - input month as integer
     * @param theYear - input year as integer*/
    public Date(int theDay, int theMonth, int theYear) {
        String result;        
        //number of days in month read in
        boolean dayValid;
        //Use the methods to determine number of days in month
        int daysInMonth = daysInMonth(theMonth, isLeapYear(theYear));
        //Use the methods to see if day is valid
        if (theDay <= 0) {
            dayValid = false;
            throw new IllegalArgumentException("Date is not valid");
        } else if (theDay <= daysInMonth) {
            dayValid = true;
        } else {
            dayValid = false;
            throw new IllegalArgumentException("Date is not valid");
        }
        
        int check1 = (isMonthValid(theMonth)) ? 1 : 0;
        int check2 = (isYearValid(theYear)) ? 1 : 0;
        int check3 = (dayValid) ? 1 : 0;
        int check4 = (isDateValid(theDay, theMonth, theYear)) ? 1 : 0;
        int sum = check1 + check2 + check3 + check4;
        
        if (Date.isLeapYear(theYear)) {
            
            switch (sum) {
                case FOUR:
                    result = "Date is valid\nLeap Year: Yes";
                    System.out.println(result);
                    break;
                default:
                    result = "Date is not valid";
                    System.out.println(result);
            }
        } else {
            switch (sum) {
                case FOUR:
                    result = "Date is valid\nLeap Year: No";
                    System.out.println(result);
                    break;
                default:
                    result = "Date is not valid";
                    System.out.println(result);
            }
        }        
    }
    
    /** Validates month input.
     * @param m - input month as integer
     * @return boolean value for validation*/
    public static boolean isMonthValid(int m) {
        return m > 0 && m < THIRTEEN;
    }
    
    /** Validates year input.
     * @param y - input year as integer
     * @return boolean value for validation*/
    public static boolean isYearValid(int y) {
        return y > SIXTWOD && y < BBEIGHT;
    }
    
    /** Validates for leap year input.
     * @param y - input year as integer
     * @return boolean value for leap year validation*/
    public static boolean isLeapYear(int y) {
        int check1 = y % ONENINETY;
        int check2 = y % FOUR;
        int check3 = y % SIXFOUR;
        return check1 == 0 || (check2 == 0 && check3 != 0);
    }
    
    /** Validates for days in month during a leap year.
     * @param m - input month as integer
     * @param isLeapYear - boolean value for leap year
     * @return integer value for days in month in leap year validation*/
    public static int daysInMonth(int m, boolean isLeapYear) {
        boolean monthValid = isMonthValid(m);
        int check1 = m % 2;
        
        if (!monthValid) {
            return 0;
        } else if (m == 2 && !isLeapYear) {
            return ONEC;
        } else if (m == 2 && isLeapYear) {
            return ONED;
        } else if (m < EIGHT && check1 != 0) {
            return ONEF;
        } else if (m >= EIGHT && check1 == 0) {
            return ONEF;
        } else {
            return ONEE;
        }
    }
    
    /** Validates for date input.
     * @param d - input day as integer
     * @param m - input month as integer
     * @param y - input year as integer
     * @return boolean value for date validation*/
    public static boolean isDateValid(int d, int m, int y) {
        String strDate = m + "" + d + "" + y;
        int intDate = Integer.parseInt(strDate);
        return intDate >= DATECHECK;
    }
    
        
    /** Runs the main program.
     *  @param args unused.
     * */
    public static void main(String[] args) { 
          
        Scanner scan = new Scanner(System.in);
        //Get integer month, day, and year from user
        System.out.println("Enter a date (mm dd yyyy):");
        Date.month = scan.nextInt();
        Date.day = scan.nextInt();
        Date.year = scan.nextInt();
        
        //Create a Date object with month, day, year
        Date date1 = new Date(Date.day, Date.month, Date.year);
        System.out.println(date1);
        scan.close();
    } 
} 
