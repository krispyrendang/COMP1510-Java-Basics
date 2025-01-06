package q3;

/** Methods for defining and checking MIXChar.
 * 
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class MIXChar {
    
    /** Constant used in array.*/
    private static final int FIVESIX = 56;
    
    /** entire collection of chars found in MIXChars. */
    private char[] mixChars;
    
    /** index of char in message object. */
    private int index;

    /** Constructor that initialize and converts a char. 
     * converts input char to a MIXChar character.
     * @param c - input char.
     */
    MIXChar(char c) {
        
        char[] mixChars = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 
            'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', 
            ',', '(', ')', '+', '-', '*', '/', '=', '$', '<', '>', 
            '@', ';', ':', '\''};
        
        for (int i = 0; i < FIVESIX; i++) {
            
        }
    }
    
    /** checks if char corresponds to a MIXChar character.
     * @param c - char checks the input char.
     * @return results as boolean.
     */
    public static boolean isMIXChar(char c) {
        
        boolean check = false;
        
        return check;
    }
    
    /** converts this MIXChar character to corresponding Java char.
     * @return c as char.
     */
    public char toChar() {
        
        String results = "";
        char c = 'c';
        c = results.charAt(0);
        return c;
        
    }
    
   
    
   
    
    /** returns numerical value of this MIXChar.
     * @return input as integer.
     */
    public int ordinal() {
        int input = 0;
        
        return input;
    }
    
    /** returns string containing this MIXChar as a Java char.
     * @return results as String.
     */
    public String toString() {
        String results = "";
        return results;
    }
    
}
