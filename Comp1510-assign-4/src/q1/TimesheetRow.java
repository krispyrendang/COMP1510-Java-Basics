package q1;


/**
 * <p>Creates time sheet row objects.</p>
 *
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class TimesheetRow {
    
    /** project ID number. */
    private int project;
    
    /** units of work completed within a project. */
    private String workPackage;
    
    /** number of hours worked each week. */
    private long hoursL;
    
    /** hours for a single day of the week. */
    private float hourF;
    
    /** a no-argument constructor.*/
    public TimesheetRow() {
        
    }
    
    /** Initialize the instance variable in the constructor.
     * @param num - integer project id.
     * @param pack - String description of work package.
     * @param hrs - float hours worked each day of the week.
     */
    public TimesheetRow(int num, String pack, float hrs) {
        
    }
    
    /**
     * <p>Drives the program. It tests if the instance variables 
     * and constructors are working.</p>
     * @param args command line arguments unused.
     */
    public static void main(String[] args) {
        //replace next line with your code:
        System.out.println("Question one was called and ran sucessfully.");
    }

    /** Returns the project ID number.
     * @return project as integer.
     */
    public int getProject() {
        
        return project;
    }
    
    /** Sets the project ID number.
     * @param num as integer.
     */
    public void setProject(int num) {
        
        project = num;
    }
    
    /** Returns the units of work completed.
     * @return workPackage as string.
     */
    public String getPackage() {
        
        return workPackage;
    }
    
    /** Sets the units of work completed.
     * @param pack as String.
     */
    public void setPackage(String pack) {
        
        workPackage = pack;
    }
    
    /** Returns the number of hours worked.
     * @return hoursL as long.
     */
    public long getHours() {
        
        return hoursL;
    }
    
    /** Sets the number of hours worked.
     * @param hrs as long.
     */
    public void setHours(long hrs) {
        
        hoursL = hrs;
    }
    
    /** Takes a day of the week number.
     * Returns the hours for that day as a float.
     * @param day - integer representing day of the week.
     * @return hourF as float.
     */
    public float getHour(int day) {
        
        return hourF;
    }
    
    /** Takes a day of the week number.
     *  Takes hours for that day float.
     *  Sets it into the appropriate byte of hours.
     * Returns the hours for that day as a float.
     * @param day - integer representing day of the week.
     * @param hrs - hours as a float.
     */
    public void setHour(int day, float hrs) {
        
        
    }
    
}



