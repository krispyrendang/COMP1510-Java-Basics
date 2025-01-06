package q1;

/** <p>
 * Word - a class that takes in a string parameter containing a word
 * and counts the number of occurrences.
 * <p>
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class Word implements Comparable<Word> {
    
    /** String containing a word passed into the constructor.*/
    private final String word;
    
    /** Frequency of the word passed into the constructor.*/
    private int frequency;
    
    /** Constructor for initializing input variables.
     * @param inputWord - unique word parsed from text file.
     */
    public Word(String inputWord) {
        frequency = 1;
        word = inputWord;
        
    }
    
    /** Returns the value of word.
     * @return word as string.
     */
    public String getWord() {
        return word;
    }
    
    /** Returns frequency of words as an integer.
     * @return frequency as integer.
     */
    public int getWordCount() {
        return frequency;
    }
    
    /** Method that increments frequency by 1.
     * @return frequency as integer.
     */
    public int incrementWordCount() {
        return frequency++;
    }
    
    /** Method that compares frequency of 2 word objects and
     *  returns an integer value to denote the results.
     * @param inputWord for comparison.
     * @return frequency as integer.
     */
    public int compareTo(Word inputWord) {
        
        if (frequency > inputWord.frequency) {
            return 1;
        } else if (frequency == inputWord.frequency) {
            return 0;
        } else {
            return -1;
        }
        
    }
    
    /** Returns the information of the Word.
     * @return result as a string.
     */
    public String toString() {
        String result = "Word:" + getWord() + "\t\tcount:" 
            + getWordCount();

        return result;
    }
    
    
    
    

}
