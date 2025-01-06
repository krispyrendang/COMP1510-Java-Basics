package q5;

import java.util.Scanner;

/**
 * This program converts 5 characters from the user input into 
 * an encoded number of base 56 and displays it on the console.
 * <p/>
 * This program then decodes the base 56 value back into the 
 * original 5 character input and displays it on the console.
 * 
 * @author Taswinder
 * @version 1.0
 */
public class Pack {
    /** Declaring constant - character at index 
     * position 3 in the string input.*/
    static final int THREE = 3;
    
    /** Declaring constant - character at index 
     * position 4 in the string input.*/
    static final int FOUR = 4;
    
    /** Declaring constant - value of the base used for encoding the 56 
     * MIX-characters position 4 in the string input.*/
    static final int BASE = 56;
    
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        String input;
        char c1;
        char c2;
        char c3;
        char c4;
        char c5;
        int encode;
        int d1;
        int d2;
        int d3;
        int d4;
        int d5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide 5 letters to encode. The "
            + "valid range is between A to I (inclusive).");
        input = scan.nextLine();

        c1 = input.charAt(0);
        c2 = input.charAt(1);
        c3 = input.charAt(2);
        c4 = input.charAt(THREE);
        c5 = input.charAt(FOUR);
        
        encode = (c1 - 'A' + 1) * BASE * BASE * BASE * BASE 
            + (c2 - 'A' + 1) * BASE * BASE * BASE 
            + (c3 - 'A' + 1) * BASE * BASE 
            + (c4 - 'A' + 1) * BASE + (c5 - 'A' + 1);
        
        System.out.println("Encoded: " + encode);
        
        d1 = encode % BASE;
        encode = encode / BASE;
        c5 = (char) (d1 - 1 + 'A');
        
        d2 = encode % BASE;
        encode = encode / BASE;
        c4 = (char) (d2 - 1 + 'A');
        
        d3 = encode % BASE;
        encode = encode / BASE;
        c3 = (char) (d3 - 1 + 'A');
        
        d4 = encode % BASE;
        encode = encode / BASE;
        c2 = (char) (d4 - 1 + 'A');
        
        d5 = encode % BASE;
        encode = encode / BASE;
        c1 = (char) (d5 - 1 + 'A');
        
        System.out.println("Decoded: " + c1 + c2 + c3 + c4 + c5);
        
        scan.close();
    }

}
