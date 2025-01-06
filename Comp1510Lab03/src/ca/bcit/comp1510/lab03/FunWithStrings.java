/*
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * FunWithStrings - Usage of strings.
 * 
 * @author Tas
 * @version 1.0
 *
 */
public class FunWithStrings {
    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        String trimmedUserInput;
        int length;
        String first;
        String last;
        
        System.out.println("What is the title of your favourite book?");
        userInput = scan.nextLine();
        System.out.println("you have entered:" + userInput);
        
        length = userInput.length();        
        System.out.println("Title length is " + length);
        
        userInput = userInput.toUpperCase();
        System.out.println(userInput);
        
        userInput = userInput.toLowerCase();
        System.out.println(userInput);
        
        trimmedUserInput = userInput.trim();
        userInput = trimmedUserInput;
        length = userInput.length();
        System.out.println("Trimmed Length is " + length);
        
        first = userInput.substring(0, 1).toUpperCase();
        last = userInput.substring((length - 1), length).toUpperCase();
        userInput = userInput.substring(1, length - 1);

        System.out.println(first + userInput + last);
        
        
        scan.close();
    }

}
