package ca.bcit.comp1510.lab11;

import java.util.Arrays;
import java.util.Scanner;

/** Program that stores user inputs as an array 
 * and reverse its index within the array.
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class ReverseArray {

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Program that reverses an Array"
            + "\nNumber of inputs in the Array?");
        int size = scan.nextInt();
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }
        
        System.out.println("Input Array is " + Arrays.toString(numbers));
      
        for (int i = 0; i < (size / 2); i++) {
            int temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;   
        }
        
        System.out.println("The reversed Array is  " 
            + Arrays.toString(numbers));

        scan.close();

    }

}
