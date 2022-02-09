package address;

import address.data.AddressBook;
import address.data.AddressEntry;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu class
 **/

class AddressBookApplication {

    public static void main(String args[]) {

        /**create instance of menu
         **/
        Menu myMenu = new Menu();

        /**Display to standard output all Menu prompts
         **/
        System.out.println(myMenu.prompt_FirstName());

        System.out.println(myMenu.prompt_LastName());

        System.out.println(myMenu.prompt_Street());

        System.out.println(myMenu.prompt_City());

        System.out.println(myMenu.prompt_State());

        System.out.println(myMenu.prompt_Zip());

        System.out.println(myMenu.prompt_Telephone());

        System.out.println(myMenu.prompt_Email());

        /** AddressBook ab creates a new instance of the AddressBook class called ab
         **/
        AddressBook ab = new AddressBook();

        /** initAddressBookExercise calls the testing method below using the newly created instance of AddressBook
         **/
        initAddressBookExercise(ab);

    }

    /** InitAddressBookExercise is testing the classes and methods used in AddressBook & AddressEntry
     **/
    static void initAddressBookExercise(AddressBook ab) {

        AddressEntry entry1 = new AddressEntry();
        entry1.AddressEntry("John", "Smith", "123 Purple Ln","Hayward", "California", 94577, "5103335151", "jsmith@gmail.com");

        AddressEntry entry2 = new AddressEntry();
        entry2.AddressEntry("Mary", "Roberts", "777 Indiana Ave", "Hoover", "Alabama", 35226,"2053324331", "mroberts@gmail.com");

        ab.add(entry1);
        ab.add(entry2);

        ab.list();

    }
}
