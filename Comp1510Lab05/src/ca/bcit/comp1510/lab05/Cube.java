package ca.bcit.comp1510.lab05;

/** Cube - calculates values of a cube.
 * @author Tas
 * @version 1.0
 */
public class Cube {
    
    /** Constant used to calculations.*/
    static final int TWO = 2;
    
    /** Constant used to calculations.*/
    static final int THREE = 3;
    
    /** Constant used to calculations.*/
    static final int SIX = 6;

    /** X-coordinate of cube.*/
    private int xValue;
    
    /** Y-coordinate of cube.*/
    private int yValue;
    
    /** Z-coordinate of cube.*/
    private int zValue;
    
    /** Edge length of cube.*/
    private int eValue;
    
    /** Constructor for initializing input variables.
     * @param x - X-coordinate of cube.  
     * @param y - Y-coordinate of cube.
     * @param z - Z-coordinate of cube.
     * @param e - Edge length of cube.
     */
    public Cube(int x, int y, int z, int e) {
        setXInput(x);
        setYInput(y);
        setZInput(z);
        setEInput(e);
    }
    
    /** Method to calculate surface area of a cube.
     * @return a as double.
     */
    public double surfaceArea() {
        
        double a = SIX * eValue * eValue;
        return a;
    }
    
    /** Method to calculate volume of a cube.
     * @return v as double.
     */
    public double volume() {
        
        double v = eValue * eValue * eValue;
        return v;
    }
    
    /** Method to calculate face diagonal of a cube.
     * @return f as double.
     */
    public double face() {
        
        double f = Math.sqrt(TWO) * eValue;
        return f;
    }
    
    /** Method to calculate space diagonal of a cube.
     * @return s as double.
     */
    public double space() {
        
        double s = Math.sqrt(THREE) * eValue;
        return s;
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
    
    /** Returns the value of e as an integer.
     * @return eValue as integer.
     */
    
    public int getEInput() {
        return eValue;
    }
    
    /** Set the value of eValue to the specified value.
     * @param e as int.
     */
    public void setEInput(int e) {
        eValue = e;
    }
    
    /** Returns the input and calculations as 1 string.
     * @return result as a string.
     */
    public String toString() {
        String result = "volume of cube: " + volume() + " surface area of "
            + "cube: " + surfaceArea() + " face diagonal of cube: " + face() 
            + " space diagonal of cube: " + space();
        
        return result;
    }
    
}
