package q2;

/**
 * <p>Balloon - Changes radius and calculates volume of a spherical balloon.</p>
 *
 * @author Tas
 * @version 1.0
 */
public class Balloon {
    
    /** Constant used in calculations.*/
    static final double THREE = 3;
    
    /** Constant used in calculations.*/
    static final double FOUR = 4;
    
    /** Radius of balloon.*/
    private double rValue;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        
    }
    
    /** Method to increase radius by the given amount.
     * @param amount a double.
     */
    public void inflate(double amount) {
        rValue = 0;
        rValue += amount;
    }
    
    /** Returns the value of inflated radius.
     * @return rValue as double.
     */
    public double getRInput() {
        return rValue;
    }
    
    /** Method to calculate volume of balloon.
     * @return v as double.
     */
    public double getVolume() {
        
        //double v = FOUR / THREE * Math.PI * Math.pow(getRInput(), THREE);
        double v = (FOUR / THREE) * Math.PI * getRInput() * getRInput() 
            * getRInput();

        return v;
        
    }
}
