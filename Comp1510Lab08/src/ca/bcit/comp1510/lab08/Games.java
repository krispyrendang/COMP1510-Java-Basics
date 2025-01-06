package ca.bcit.comp1510.lab08;

import java.util.Random;
import java.util.Scanner;

/** Games - a game using random numbers.
 * @author Tas
 * @version 1.0
 */
public class Games {
    
    /** Constant used for menu option.*/
    static final int TWO = 2;
    
    /** Constant used for menu option.*/
    static final int THREE = 3;
    
    /** Constant used for menu option.*/
    static final int FOUR = 4;
    
    /** Constant used for scoring.*/
    static final int FIVE = 5;
    
    /** Constant used for guessing.*/
    static final int HUNDRED = 100;
    
    /** User's score.*/
    private int score;
    
    /** Scanner object for user input.*/
    private Scanner scan;
    
    /** Random object for random numbers.*/
    private Random rand;
    
    /** Constructor for initializing input variables.*/
    public Games() {
        score = 0;
        scan = new Scanner(System.in);
        rand = new Random();
        
    }
    
    /** Runs a menu for users to select.*/
    public void play() {
        int i = 0;
        while (i != FOUR) {
            System.out.print("Welcome to the Games program!" 
                    + "\nMake your choice (enter a number):" 
                    + "\n1. See your score"
                    + "\n2. Guess a number"
                    + "\n3. Play Rock, Paper, Scissors"
                    + "\n4. Quit"
                    + "\n>");
            i = scan.nextInt();
            
            switch (i) {
                case 1:
                    System.out.println("Score: " + score);
                    break;
                case TWO:
                    guessANumber();
                    break;
                case THREE:
                    rockPaperScissors();
                    break;
                case FOUR:
                    break;
                default:
                    System.out.println("That's not a valid choice!");
            }
        }
    }
    
    /** Runs a game to guess a number.*/
    public void guessANumber() {
        boolean guess = false;
        int count = 0;
        int num = rand.nextInt(HUNDRED) + 1;
        System.out.println("I've picked a random number between 0 and 100"
                + "\nCan you guess it?"
                + "\nGuess the number!");
        while (!guess) {
            int input = scan.nextInt();
            if (input == num) {
                guess = true;
                if (count < FIVE) {
                    score += FIVE;
                    System.out.println("RIGHT!\nFive points!");
                } else {
                    System.out.println("RIGHT!");
                }
                
            } else if (input > num) {
                System.out.println("Too high, guess again!"
                    + "\nGuess the number!");
                count++;
            } else {
                System.out.println("Too low, guess again!"
                        + "\nGuess the number!");
                count++;
            }
            
        }
        
    }
    
    /** Runs a game called Rock Paper Scissors.*/
    public void rockPaperScissors() {
        int num = rand.nextInt(THREE);
        String input = "";
        boolean guess = false;
        System.out.println("I've picked one of ROCK, PAPER, and SCISSORS\r\n"
                + "Which one do you choose?");
        input = scan.next();
        while (!guess) {
            switch (input) {
                case "rock":
                    if (num == TWO) {
                        System.out.println("Yes! Rock smashes scissors");
                        score += FIVE;
                    } else if (num == 1) {
                        System.out.println("Nope, I picked Paper");
                        score -= THREE;
                    } else {
                        System.out.println("Nope, I picked Rock");
                    }  
                    guess = true;
                    break;
                case "paper":
                    if (num == 0) {
                        System.out.println("Yes! Paper wraps rock");
                        score += FIVE;
                    } else if (num == 1) {
                        System.out.println("Nope, I picked Paper");
                    } else {
                        System.out.println("Nope, I picked Scissors");
                        score -= THREE;
                    } 
                    guess = true;
                    break;
                case "scissors":
                    if (num == 1) {
                        System.out.println("Yes! Scissors cut paper");
                        score += FIVE;
                    } else if (num == TWO) {
                        System.out.println("Nope, I picked Scissors");
                    } else {
                        System.out.println("Nope, I picked Rock");
                        score -= THREE;
                    } 
                    guess = true;
                    break;
                default:
                    System.out.println("That's not a valid choice! Try again!");
                    input = scan.next();
            }
        }
         
    }
    
}
