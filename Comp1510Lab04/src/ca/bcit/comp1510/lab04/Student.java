/**

 * 
 */

package ca.bcit.comp1510.lab04;

/** Class that collects/stores information about a student.
 * @author Tas
 * @version 1.0
 *
 */
public class Student {

    /** Student First name. */
    private String firstName;
    
    /** Student Last name. */
    private String lastName;
    
    /** Student Year of Birth. */
    private int birthYear;
    
    /** Student Number. */
    private String studentID;
    
    /** Student GPA. */
    private int studentGPA;
    
    /** Constructor for Student profile.
     * 
     * @param first - student first name.
     * @param last - student last name.
     * @param year - student year of birth.
     * @param id - student number.
     * @param gpa - student GPA.
     */
    public Student(String first, String last, int year, String id, int gpa) {
        setFirstName(first);
        setLastName(last);
        setBirthYear(year);
        setStudentNumber(id);
        setGradeAverage(gpa);
        
        
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
    
    /** 
     *  Returns the value of birth year as an int.
     * @return birthYear as a int.
     */
    
    public int getBirthYear() {
        return birthYear;
    }
    
    /** 
     * Set the value of birth year to the specified value.
     * @param year an int.
     */
    public void setBirthYear(int year) {
        birthYear = year;
    }
    
    /** 
     *  Returns the value of student number as an int.
     * @return studentID as an int.
     */
    
    public String getStudentNumber() {
        return studentID;
    }
    
    /** 
     * Set the value of student number to the specified value.
     * @param id an int.
     */
    public void setStudentNumber(String id) {
        studentID = id;
    }
    
    /** 
     *  Returns the value of student GPA as a int.
     * @return studentGPA as a int.
     */
    
    public int getGradeAverage() {
        return studentGPA;
    }
    
    /** 
     * Set the value of student GPA to the specified value.
     * @param gpa as a int.
     */
    public void setGradeAverage(int gpa) {
        studentGPA = gpa;
    }
    
    /** Returns the Student parts of the full name as 1 string.
     * @return result as a string.
     */
    public String toString() {
        String result = firstName + " " + lastName + " " + birthYear 
            + " " + studentID + " " + studentGPA;

        return result;
    }
    
    
}
