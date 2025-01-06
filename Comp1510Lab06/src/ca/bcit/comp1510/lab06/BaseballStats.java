package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * @author Tas
 * @version 1.0
 *
 */

public class BaseballStats {
    /**
     * Reads baseball stats from a file and counts
     *  total hits, outs, walks, and sacrifice flies
     * for each player.
     * 
     * @param args unused.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan;
        Scanner lineScan;
        String fileName;
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));
        
        // Reads and processes each line of the file
        while (fileScan.hasNext()) {
            String line = fileScan.nextLine();
            int hits;
            int outs;
            int walks;
            int sacrifices;
            
            //Initializing variables
            hits = 0;
            outs = 0;
            walks = 0;
            sacrifices = 0;
            
            //Create a new token at each delimiter (,)
            lineScan = new Scanner(line.trim());
            lineScan.useDelimiter("[,]");
            String name = lineScan.next();


            // Reads and process each token in a line
            while (lineScan.hasNext()) {
                String check = lineScan.next();
                if (check.equals("h")) {
                    hits++;
                } 
                if (check.equals("o")) {
                    outs++;                    
                } 
                if (check.equals("w")) {
                    walks++;
                } 
                if (check.equals("s")) {
                    sacrifices++;
                }
                        
            }
            System.out.println(name + " hits:" + hits + " outs:" 
                + outs + " walks:" + walks + " sacrifice fly:" + sacrifices
                + " batting average:" + ((double) hits / (hits + outs)));
                    
                
        }
        scan.close();

            
    }

}

