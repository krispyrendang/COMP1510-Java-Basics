package ca.bcit.comp1510.lab10;

/** Program with 2 constructors that take in first, 
 *  middle and last names as strings.
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class Name implements Comparable<Name> {
    
    /** First Name passed into the constructor.*/
    private final String firstName;
    
    /** Middle Name passed into the constructor.*/
    private final String midName;
    
    /** Last Name passed into the constructor.*/
    private final String lastName;
    
    /** Constructor for taking in first, middle and last names.
     * @param first - first name.
     * @param middle - middle name.
     * @param last - last name.
     */
    public Name(String first, String middle, String last) 
        throws IllegalArgumentException {
        
        if (first == null || first.isEmpty() || first.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Please enter a valid "
                + "first name.");
        } 
        if (middle.isEmpty() || middle.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Please enter a valid "
                + "middle name.");
        }
        if (last == null || last.isEmpty() || last.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Please enter a valid "
                + "last name.");
        }
               
        firstName = first;
        midName = middle;
        lastName = last;
        
    }
    
    /** Constructor for taking in first and last names.
     * @param first - first name.
     * @param last - last name.
     */
    public Name(String first, String last) 
        throws IllegalArgumentException {
        
        if (first == null || first.isEmpty() || first.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Please enter a valid "
                + "first name.");
        }
        
        if (last == null || last.isEmpty() || last.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Please enter a valid "
                + "last name.");
        }
        
        firstName = first;
        midName = "";
        lastName = last;
    }
    
    /** Returns the value of firstName.
     * @return firstName as string.
     */
    public String getFirstName() {
        
        return firstName;
    }
    
    /** Returns the value of midName.
     * @return midName as string.
     */
    public String getMidName() {
        
        return midName;
    }
    
    /** Returns the value of lastName.
     * @return lastName as string.
     */
    public String getLastName() {
        
        return lastName;
    }

    /** Returns the value of the comparison between names.
     * @param o the name object passed in for comparing names.
     * @return check1/check2/check3 as integer.
     */
    public int compareTo(Name o) {
        
        int check1 = lastName.compareToIgnoreCase(o.getLastName());
        int check2 = firstName.compareToIgnoreCase(o.getFirstName());
        int check3 = midName.compareToIgnoreCase(o.getMidName());
        
        if (check1 != 0) {
            return check1;
        } else if (check2 != 0) {
            return check2;
        } 
        
        return check3;
    }
    
    /** Returns the information of the name object.
     * @return result as a string.
     */
    public String toString() {
        String result = "\nName:\t" + getLastName() + ", " 
            + getFirstName() + " " + getMidName();

        return result;
    }

}
