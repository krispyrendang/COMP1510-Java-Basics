package q3;

/** Cylinder - calculates values of a cylinder.
 * @author Tas
 * @version 1.0
 */
public class Cylinder {
    
    /** Constant used in calculations.*/
    static final double TWO = 2;
    
    /** Radius of cylinder.*/
    private double rValue;
    
    /** Height of cylinder.*/
    private double hValue;
    
    /** Constructor for initializing input variables.
     * @param r - radius of cylinder.  
     * @param h - height of cylinder.
     */
    public Cylinder(double r, double h) {
        setRInput(r);
        setHInput(h);
    }
    
    /** Method to calculate surface area of a cylinder.
     * @return a as double.
     */
    public double surfaceArea() {
        
        double a = TWO * Math.PI * rValue * (rValue + hValue);
        return a;
    }
    
    /** Method to calculate volume of a cylinder.
     * @return v as double.
     */
    public double volume() {
        
        double v = Math.PI * Math.pow(rValue, 2) * hValue;
        return v;
    }
    
    /** Returns the radius as a double.
     * @return rValue as double.
     */
    public double getRInput() {
        return rValue;
    }
    
    /** Set the radius to the specified value.
     * @param r as double.
     */
    public void setRInput(double r) {
        rValue = r;
    }
    
    /** Returns the height as double.
     * @return hValue as double.
     */
    
    public double getHInput() {
        return hValue;
    }
    
    /** Set the height to the specified value.
     * @param h as double.
     */
    public void setHInput(double h) {
        hValue = h;
    }
    
    /** Returns the input height and radius as 1 string.
     * @return result as a string.
     */
    public String toString() {
        String result = "radius:" + getRInput() 
            + ",\n" + "height:" + getHInput();

        return result;
    }
    

}
