package address.data;

import java.util.ArrayList;

/** AddressBook class holds a collection of objects of the class AddressEntry using an ArrayList
 **/
public class AddressBook {

    ArrayList<AddressEntry> AddressEntryList = new ArrayList<>();

    /** The list() method Iterates through the AddressEntryList ArrayList and uses the toString() method from the AddressEntry class to print them out
     **/
    public void list() {

        for (AddressEntry addressEntry : AddressEntryList) {

            System.out.println(addressEntry);
        }
    }

    /** The add() method takes individual AddressEntries and adds them to the AddressEntryList
     **/
    public void add(AddressEntry Entry) {

        AddressEntryList.add(Entry);

    }

}
