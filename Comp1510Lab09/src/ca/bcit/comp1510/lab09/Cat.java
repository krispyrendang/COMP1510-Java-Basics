package ca.bcit.comp1510.lab09;

/** Class Cat - adds a name and age to a cat.
 * @author Tas
 * @version 1.0
 */
public class Cat {
    
    /** Name of cat passed into the constructor.*/
    private final String catName;
    
    /** Age of cat passed into the constructor.*/
    private int catAge;
    
    /** Constructor for initializing input variables.
     * @param inputName - name of cat.
     * @param inputAge - age of cat in years.
     */
    public Cat(String inputName, int inputAge) {
        setCatAge(inputAge);
        if (inputName.trim().isEmpty()) {
            catName = "Cleo";
        } else {
            catName = inputName;
        }        
    }
    
    /** Returns the value of catName.
     * @return catName as string.
     */
    public String getCatName() {
        return catName;
    }
    
    /** Returns the value of catAge as an integer.
     * @return catAge as integer.
     */
    public int getCatAge() {
        return catAge;
    }
    
    /** Set the value of catAge to the specified value.
     * @param inputAge a integer.
     */
    public void setCatAge(int inputAge) {
        catAge = ((inputAge <= 0) ? 0 : inputAge);
    }
    
    /** Returns the information of the Cat.
     * @return result as a string.
     */
    public String toString() {
        String result = "Cat Name:" + getCatName() + "\nCat Age:" 
            + getCatAge();

        return result;
    }

}
