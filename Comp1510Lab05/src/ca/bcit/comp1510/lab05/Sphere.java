package ca.bcit.comp1510.lab05;

/** Sphere - calculates values of a sphere.
 * @author Tas
 * @version 1.0
 */
public class Sphere {
    
    /** Constant used to calculations.*/
    static final int THREE = 3;
    
    /** Constant used to calculations.*/
    static final int FOUR = 4;

    /** X-coordinate of sphere.*/
    private int xValue;
    
    /** Y-coordinate of sphere.*/
    private int yValue;
    
    /** Z-coordinate of sphere.*/
    private int zValue;
    
    /** Radius of sphere.*/
    private int rValue;
    
    /** Constructor for initializing input variables.
     * @param x - X-coordinate of sphere.  
     * @param y - Y-coordinate of sphere.
     * @param z - Z-coordinate of sphere.
     * @param r - Radius of sphere.
     */
    public Sphere(int x, int y, int z, int r) {
        setXInput(x);
        setYInput(y);
        setZInput(z);
        setRInput(r);
        
    }
    
    /** Method to calculate surface area of a sphere.
     * @return a as double.
     */
    public double surfaceArea() {
        
        double a = FOUR * Math.PI * rValue * rValue;
        return a;
    }
    
    /** Method to calculate volume of a sphere.
     * @return v as double.
     */
    public double volume() {
        
        double v = FOUR / THREE * Math.PI * rValue * rValue * rValue;
        return v;
    }

    /** Returns the value of x as an integer.
     * @return xValue as integer.
     */
    public int getXInput() {
        return xValue;
    }
    
    /** Set the value of xValue to the specified value.
     * @param x a string.
     */
    public void setXInput(int x) {
        xValue = x;
    }
    
    /** Returns the value of y as an integer.
     * @return yValue as integer.
     */
    
    public int getYInput() {
        return yValue;
    }
    
    /** Set the value of yValue to the specified value.
     * @param y a string.
     */
    public void setYInput(int y) {
        yValue = y;
    }
    
    /** Returns the value of z as an integer.
     * @return zValue as integer.
     */
    
    public int getZInput() {
        return zValue;
    }
    
    /** Set the value of zValue to the specified value.
     * @param z a integer.
     */
    public void setZInput(int z) {
        zValue = z;
    }
    
    /** Returns the value of r as an integer.
     * @return rValue as integer.
     */
    
    public int getRInput() {
        return rValue;
    }
    
    /** Set the value of rValue to the specified value.
     * @param r as int.
     */
    public void setRInput(int r) {
        rValue = r;
    }
    
    /** Returns the input and calculations as 1 string.
     * @return result as a string.
     */
    public String toString() {
        String result = "volume of sphere:" + volume() 
            + " surface area of sphere:" + surfaceArea();

        return result;
    }


}
