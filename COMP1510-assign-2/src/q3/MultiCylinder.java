package q3;

/**
 * <p>MultiCylinder - calculates values of 2 different cylinders.</p>
 *
 * @author Tas
 * @version 1.0
 */
public class MultiCylinder {
    
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
        double r;
        double h;
        
        //Cylinder 1 initial values
        r = THREE;
        h = FIVE;
        Cylinder cylinder1 = new Cylinder(r, h);
        System.out.println("Cylinder 1 initial values: \n" 
            + cylinder1.toString());
        
        //Cylinder 2 initial values
        r = TWO;
        h = FOUR;
        Cylinder cylinder2 = new Cylinder(r, h);
        System.out.println("Cylinder 2 initial values: \n" 
            + cylinder2.toString());
        
        //Cylinder 1 modified values
        cylinder1.setRInput(TWO);
        cylinder1.setHInput(FOUR);
        System.out.println("Cylinder 1 updated values: \n" 
            + cylinder1.toString());
        
        //Cylinder 2 modified values
        cylinder1.setRInput(THREE);
        cylinder1.setHInput(FIVE);
        System.out.println("Cylinder 2 updated values: \n" 
            + cylinder1.toString());
        
        //Cylinder 1 final volume and surface area
        System.out.println("Cylinder 1 final volume:" + cylinder1.volume() 
            + ", surface area:" + cylinder1.surfaceArea());
        
        //Cylinder 2 final volume and surface area
        System.out.println("Cylinder 2 final volume:" + cylinder2.volume() 
            + ", surface area:" + cylinder2.surfaceArea());
        

    }

}
