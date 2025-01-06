package q4;

/**
 * <p>TestBox - calculates values of 2 different boxes.</p>
 *
 * @author Tas
 * @version 1.0
 */
public class TestBox {
    
    /** Constant used in calculations.*/
    static final double TWO = 2;
    
    /** Constant used in calculations.*/
    static final double THREE = 3;
    
    /** Constant used in calculations.*/
    static final double FOUR = 4;
    
    /** Constant used in calculations.*/
    static final double FIVE = 5;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments unused.
     */
    public static void main(String[] args) {
        double h;
        double w;
        double d;
        double v;
        
        //Box 1 is 2 by 2 by 2, 100% full
        h = TWO;
        w = TWO;
        d = TWO;
        v = h * w * d;
        Box box1 = new Box(h, w, d);
        box1.setNewContents(v);
        
        //Box 2 is 4 by 4 by 4, holds same contents as box 1
        h = FOUR;
        w = FOUR;
        d = FOUR;
        Box box2 = new Box(h, w, d);
        box2.setNewContents(v);

        //Print a description about the 2 boxes before modifications
        System.out.println("Box 1: " + box1.toString());
        System.out.println("Box 2: " + box2.toString());
        
        //Box 1 dimensions are modified bigger, same contents as before
        box1.setHInput(FIVE);
        box1.setHInput(FIVE);
        box1.setHInput(FIVE);
        
        //Box 2 dimensions are modified smaller, same contents as before
        box2.setHInput(THREE);
        box2.setHInput(THREE);
        box2.setHInput(THREE);
        
        //Print a description about the 2 boxes after modifications
        System.out.println("After modifications, Box 1: " + box1.toString());
        System.out.println("After modifications, Box 2: " + box2.toString());
        

    }

}
