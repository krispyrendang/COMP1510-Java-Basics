package ca.bcit.comp1510.lab05;

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
    
    /** Method to calculate length of the full name.
     * @return nl as int.
     */
    public double nameLength() {
        
        int nl = firstName.length() + midName.length() + lastName.length();
        return nl;
    }
    
    /** Method to return initials of names to uppercase.
     * @return uppercase as string.
     */
    public String uppercase() {
        
        String uppercase = firstName.substring(0, 1).toUpperCase() 
            + midName.substring(0, 1).toUpperCase() 
            + lastName.substring(0, 1).toUpperCase();
        return uppercase;
    }
    
    /** Method to accepts an integer n and returns the nth character 
     * in the full three part name.
     * @param n - nth character of the full name.
     * @return index as char.
     */
    public char index(int n) {
        
        String name = firstName + midName + lastName;
        char index = name.charAt(n);
        return index;
    }
    
    /** Returns the full name in order of last, first, middle.
     * @return result as a string.
     */
    public String orderLast() {
        String result = lastName + ", " + firstName + " " + midName;

        return result;
    }
    
    /** Returns true if input match first name.
     * @param first - first name.
     * @return output as a boolean.
     */
    public boolean comFirstName(String first) {

        return firstName.equals(first);
    }
    
    /** Returns true if input match full name.
     * @param name - full name.
     * @return output as a boolean.
     */
    public boolean comFullName(Name name) {

        return toString().equals(name.toString());
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
