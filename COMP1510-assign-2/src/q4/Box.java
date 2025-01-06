package q4;

/** Box - calculates values of a box.
 * @author Tas
 * @version 1.0
 */
public class Box {
    
    /** Constant used in calculations.*/
    static final double MAX = 100;
    
    /** Height of box in centimeters.*/
    private double hValue;
    
    /** Width of box in centimeters.*/
    private double wValue;
    
    /** Depth of box in centimeters.*/
    private double dValue;
    
    /** Contents of box in cubic centimeters.*/
    private double contents;
    
    /** Constructor for initializing input variables.
     * @param h - height of box.  
     * @param w - width of box.
     * @param d - depth of box.
     */
    public Box(double h, double w, double d) {
        setHInput(h);
        setWInput(w);
        setDInput(d);
        setNewContents(0);
    }
    
    /** Method to calculate the percentage of contents inside the box.
     * @return percent as double.
     */
    public double percentFull() {
        
        double vol = hValue * wValue * dValue;
        double percent = contents / vol * MAX;
        
        return percent;
    }
    
    /** Returns the box height as a double.
     * @return hValue as double.
     */
    public double getHInput() {
        return hValue;
    }
    
    /** Set the height of box.
     * @param h a double.
     */
    public void setHInput(double h) {
        hValue = h;
    }
    
    /** Returns the box width as a double.
     * @return wValue as double.
     */
    public double getWInput() {
        return wValue;
    }
    
    /** Set the width of box.
     * @param w a double.
     */
    public void setWInput(double w) {
        wValue = w;
    }
    
    /** Returns the box depth as a double.
     * @return dValue as double.
     */
    public double getDInput() {
        return dValue;
    }
    
    /** Set the depth of box.
     * @param d a double.
     */
    public void setDInput(double d) {
        dValue = d;
    }
    
    /** Returns the volume of box contents as a double.
     * @return contents as double.
     */
    public double getContents() {
        return contents;
    }
    
    /** Set the volume of contents in box.
     * @param v a double.
     */
    public void setNewContents(double v) {
        contents = v;
    }
    
    /** Returns the input and calculations as 1 string.
     * @return result as a string.
     */
    public String toString() {
        String result = "height " + getHInput() + "cm, width " 
            + getWInput() + "cm, depth " + getDInput() + "cm, is " 
            + percentFull() + " percent full.";
        
        return result;
    }
}
