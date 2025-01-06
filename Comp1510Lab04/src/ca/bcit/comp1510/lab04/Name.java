/** 

 * 
 */

package ca.bcit.comp1510.lab04;

/** Class that collects user input name as strings.
 * @author Tas
 * @version 1.0
 *
 */
public class Name {

    /** First name. */
    private String firstName;
    
    /** Middle name. */
    private String midName;
    
    /** Last name. */
    private String lastName;
    
    /** Constructor for Name.
     * @param first - first name.  
     * @param middle - middle name. 
     * @param last - last name.
     */
    public Name(String first, String middle, String last) {
        setFirstName(first);
        setMidName(middle);
        setLastName(last);
        
    }
    
    /** 
     *  Returns the value of first name as a string.
     * @return firstName as a string.
     */
    
    public String getFirstName() {
        return firstName;
    }
    
    /** 
     * Set the value of firstName to the specified value.
     * @param first a string.
     */
    public void setFirstName(String first) {
        firstName = first;
    }
    
    /** 
     *  Returns the value of middle name as a string.
     * @return midName as a string.
     */
    
    public String getMidName() {
        return midName;
    }
    
    /** 
     * Set the value of midName to the specified value.
     * @param middle a string.
     */
    public void setMidName(String middle) {
        midName = middle;
    }
    
    /** 
     *  Returns the value of last name as a string.
     * @return lastName as a string.
     */
    
    public String getLastName() {
        return lastName;
    }
    
    /** 
     * Set the value of lastName to the specified value.
     * @param last a string.
     */
    public void setLastName(String last) {
        lastName = last;
    }
    
    
    /** Returns the 3 parts of the full name as 1 string.
     * @return result as a string.
     */
    public String toString() {
        String result = firstName + " " + midName + " " + lastName;

        return result;
    }
    
}
