package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.util.Scanner;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu class
 **/

class AddressBookApplication {

    public static void main(String args[]) {

        /**
         * AddressBook ab creates a new instance of the AddressBook class called ab
         */
        AddressBook ab = new AddressBook();
        /**
         * create instance of menu
         */
        Menu Menu = new Menu();
        /**
         * create instance of scanner
         */
        Scanner keyboard = new Scanner(System.in);

        boolean noQuit = true;
        while (noQuit) {
            //display menu
            Menu.displayMenu();
            //get input from user for menu prompt
            String input = keyboard.nextLine();
            System.out.println("\n\n");
            switch(input) {
                case "a": //read from file
                    System.out.println("Enter in FileName:");
                    ab.readFromFile(keyboard.nextLine());
                    break;
                case "b": ab.add(Menu.promptNewAddressEntry());//add to address book
                    break;
                case "c": //removes entry from address book
                    System.out.println("Enter in Last Name of contact to remove:");
                    ab.remove(keyboard.nextLine());
                    break;
                case "d": //finds specific AddressEntry based on last name
                    System.out.println("Enter in all or beginning of last name to find:");
                    ab.find(keyboard.nextLine());
                    break;
                case "e": ab.list(); //Lists all entries in address book
                    break;
                case "f": noQuit = false; //Quits the program
                    break;
            }

        }

    }
}

