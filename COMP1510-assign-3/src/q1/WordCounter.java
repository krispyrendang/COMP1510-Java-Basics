package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class WordCounter {
    
    /** Constant used for the program.*/
    public static final int TEN = 10;
    
    /** String containing a word passed into the constructor.*/
    private ArrayList<Word> listOfWords;
    
    /** Constructor for initializing input variables.
     */
    public WordCounter() {
        listOfWords = new ArrayList<Word>();

    }
    
    /** Parse the text file to check for number of unique words.
     * @param inputFile the file that needs to be parsed.
     * @return unique as integer.
     */
    public int parseBook(String inputFile) throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File(inputFile));
        Scanner lineScan;
        String wordInput;
        String line;
        boolean check = false;
        
        while (fileScan.hasNext()) {
            line = fileScan.nextLine();
            lineScan = new Scanner(line.toLowerCase());
            lineScan.useDelimiter("[^a-zA-Z]+");
            int i;
            int count;
            while (lineScan.hasNext()) {
                wordInput = lineScan.next();
                check = false;
                count = 0;
                for (i = 0; i < listOfWords.size(); i++) {
                    String compare = listOfWords.get(i).getWord();
                    if (compare.equals(wordInput)) {
                        check = true;
                        count = i;
                    } 
                }
                
                if (!check) {
                    Word inputNewWord = new Word(wordInput);
                    listOfWords.add(inputNewWord);
                } else {
                    listOfWords.get(count).incrementWordCount();
                }
            }
        }
        fileScan.close();
        
        return listOfWords.size();
    }
    
    /** Prints the top N number of unique words.
     * @param limit - the number of top words - integer.
     */
    public void printTopWords(int limit) {
        int index = listOfWords.size() - limit;
        listOfWords.sort(null);
        for (int i = listOfWords.size() - 1; i >= index; i--) {
            System.out.println(listOfWords.get(i).toString());
        }
    }
    
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * <p>Main method calls a word counter object and counts 
     * the most frequently used unique words in the user provided text file.</p>
     *
     * @param args command line arguments is unused.
     * @throws FileNotFoundException - throws an exception if 
     *     the file is not found.
     */
    public static void main(String[] args) throws FileNotFoundException {
        WordCounter counter = new WordCounter();
        String fileName = "src/bible.txt";
        int total = counter.parseBook(fileName);
        System.out.println("\nTotal number of words: " 
            + total);
        counter.printTopWords(TEN);
        
    }

}
