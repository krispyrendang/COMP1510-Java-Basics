package ca.bcit.comp1510.lab05;

/** Cone - calculates values of a cone.
 * @author Tas
 * @version 1.0
 */
public class Cone {
    
    /** Constant used to calculations.*/
    static final int THREE = 3;
    
    /** Height of cone.*/
    private int hValue;
    
    /** Radius of cone.*/
    private int rValue;
    
    /** Constructor for initializing input variables.
     * @param h - Height of cone.
     * @param r - Radius of sphere.
     */
    public Cone(int r, int h) {
        setRInput(r);
        setHInput(h);
    }
    
    /** Method to calculate volume of a cone.
     * @return v as double.
     */
    public double volume() {
        
        double v = 1 / THREE * Math.PI * rValue * rValue * hValue;
        return v;
    }
    
    /** Method to calculate slant height of a cone.
     * @return sh as double.
     */
    public double slantH() {
        
        double sh = Math.sqrt(rValue * rValue + hValue * hValue);
        return sh;
    }
    
    /** Method to calculate surface area of a cube.
     * @return a as double.
     */
    public double surfaceArea() {
        
        double a = Math.PI * rValue * rValue + Math.PI * rValue * slantH();
        return a;
    }
    
    /** Returns the value of r as an integer.
     * @return rValue as integer.
     */
    
    public int getRInput() {
        return rValue;
    }
    
    /** Set the value of rValue to the specified value.
     * @param r a integer.
     */
    public void setRInput(int r) {
        rValue = r;
    }
    
    /** Returns the value of h as an integer.
     * @return hValue as integer.
     */
    
    public int getHInput() {
        return hValue;
    }
    
    /** Set the value of hValue to the specified value.
     * @param h as int.
     */
    public void setHInput(int h) {
        hValue = h;
    }
    
    /** Returns the input and calculations as 1 string.
     * @return result as a string.
     */
    public String toString() {
        String result = "volume of cone:" + volume() + " slant height cone:" 
            + slantH() + " surface area of cone:" + surfaceArea();

        return result;
    }
    
   
}
