/** 
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/** CardGame - Generates random poker cards.
 * @author Tas
 * @version 1.0
 */
public class CardGame {
    
    enum Rank {
        /** Declaring a constant card value - ACE. */
        ACE,
        /** Declaring a constant card value - TWO. */
        TWO,
        /** Declaring a constant card value - THREE. */
        THREE,
        /** Declaring a constant card value - FOUR. */
        FOUR,
        /** Declaring a constant card value - FIVE. */
        FIVE,
        /** Declaring a constant card value - SIX. */
        SIX,
        /** Declaring a constant card value - SEVEN. */
        SEVEN,
        /** Declaring a constant card value - EIGHT. */
        EIGHT,
        /** Declaring a constant card value - NINE. */
        NINE,
        /** Declaring a constant card value - TEN. */
        TEN,
        /** Declaring a constant card value - JACK. */
        JACK,
        /** Declaring a constant card value - QUEEN. */
        QUEEN,
        /** Declaring a constant card value - KING. */
        KING
        
    }

    enum Suit {
        /** Declaring a constant card suit - HEARTS. */
        HEARTS,
        /** Declaring a constant card suit - DIAMONDS. */
        DIAMONDS,
        /** Declaring a constant card suit - CLUBS. */
        CLUBS,
        /** Declaring a constant card suit - SPADES. */
        SPADES
        
    }

    /** Drives the program.
     * @param args unused.
     */
    
    public static void main(String[] args) {
        Random random = new Random();
        
        int randomRankChoice = random.nextInt(Rank.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        
        int randomSuitChoice = random.nextInt(Suit.values().length);
        Suit randomSuit = Suit.values()[randomSuitChoice];
        
        System.out.println(randomRank + " of " + randomSuit);

    }

}
