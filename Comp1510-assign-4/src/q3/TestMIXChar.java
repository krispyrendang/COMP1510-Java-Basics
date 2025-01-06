package q3;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class TestMIXChar {
    
    //the following are for reference, you may want to move them or copy them 
    //to another class (provide javadoc if you use them).
    private static final char DELTA = '\u0394';
    
    private static final char SIGMA = '\u03A3';
    
    private static final char PI = '\u03A0';
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        String input = "";
        char c = 'c';
        
        //convert the args[] to a string input.
        for (int i = 0; i < args.length; i++) {
            input += "" + args[i];
                                          
            System.out.println(input);
        }
        
        //check each character for MIXChar values.
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            MIXChar check = new MIXChar(c);
            check.isMIXChar(c);
            
        }
        
        
    
    }
    
}
