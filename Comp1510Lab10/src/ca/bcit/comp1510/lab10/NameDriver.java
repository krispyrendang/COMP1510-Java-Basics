package ca.bcit.comp1510.lab10;

import java.util.ArrayList;

/** Driver that takes in and store names from user input.
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class NameDriver {

    /** Drives the program.
     * @param args is unused.
     */
    public static void main(String[] args) {
        
        ArrayList<Name> nameList = new ArrayList<Name>();
        Name name1 = new Name("harry", "The", "grasshopper");
        Name name2 = new Name("flik", "Insect");
        Name name3 = new Name("Hopper", "Not", "mosquito");
        Name name4 = new Name("PT", "Flea");
        Name name5 = new Name("Queen", "bee", "insect");
        Name name6 = new Name("Flora", "doctor", "Insect");
        
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);
        nameList.add(name5);
        nameList.add(name6);

        nameList.sort(null);
        System.out.println("Sorted Name List:\n" + nameList.toString());

    }

}
