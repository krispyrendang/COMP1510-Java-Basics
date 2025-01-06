package q1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Creates time sheet objects consisting of time sheet rows.</p>
 *
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class Timesheet {
    
    /** an employee number. */
    private String empNum;
    
    /** an end date (ending on a Friday). */
    private LocalDate endWeek;
    
    /** a list of TimesheetRow objects. */
    private List<TimesheetRow> payroll = new ArrayList<TimesheetRow>();  
    
    /** A no-argument constructor.*/
    public Timesheet() {
        
    }
    
    /** A constructor that initialize the instance variables.
     *  @param id - string id of employee.
     *  @param day - local date end date.
     * */
    public Timesheet(String id, LocalDate day) {
        
    }
    
    /**
     * <p>Drives the program.</p>
     *
     * @param args command line arguments is unused.
     */
    public static void main(String[] args) {
        Timesheet week1 = new Timesheet("8246", LocalDate.parse("2022-03-04"));
        Timesheet week2 = new Timesheet("8246", LocalDate.parse("2022-03-11"));
        Timesheet week3 = new Timesheet("8246", LocalDate.parse("2022-03-11"));
        
        
        
        
        
    }
    
    /** Returns the employee number.
     * @return empNum as String.
     */
    public String getEmpNum() {
        
        return empNum;
    }
    
    /** Sets the employee number.
     * @param id as String.
     */
    public void setProject(String id) {
        
        empNum = id;
    }
    
    /** Adds a timesheet row object to the end of the list.
     * @param row as timesheet row.
     */
    public void addRow(TimesheetRow row) {
        
        payroll.add(row);
    }
    
    

}
