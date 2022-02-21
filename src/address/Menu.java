package address;

import address.data.AddressEntry;
import java.util.Scanner;

/**
 * Menu class creates all println prompts as well as most inputs for user I/O
 * @author Joseph McDonald
 */
class Menu {

    Scanner keyboard = new Scanner(System.in);

    /**
     * Prints out the menu used for user input
     */
    void displayMenu() {
        System.out.println("\n*********************\n"
                           + "Please enter your menu selection\n"
                           + "a) Loading From File\n"
                           + "b) Addition\n"
                           + "c) Removal\n"
                           + "d) Find\n"
                           + "e) Listing\n"
                           + "f) Quit\n"
                           + "*********************\n");
    }

    /**
     * prompt_FirstName  generates a standard output prompt for the First Name to be entered
     */
    public String promptFirstName() {

        return "First Name:";

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Last Name to be entered
     */
    public String promptLastName() {

        return "Last Name:";
    }

    /**
     * prompt_Street  generates a standard output prompt for the Street to be entered
     */
    public String promptStreet() {

        return "Street:";
    }

    /**
     * prompt_City  generates a standard output prompt for the City to be entered
     */
    public String promptCity() {

        return "City:";
    }

    /**
     * prompt_State  generates a standard output prompt for the State to be entered
     */
    public String promptState() {

        return "State:";
    }

    /**
     * prompt_Zip  generates a standard output prompt for the Zip to be entered
     */
    public String promptZip() {

        return "Zip:";
    }

    /**
     * prompt_Telephone  generates a standard output prompt for the Telephone to be entered
     */
    public String promptTelephone() {

        return "Telephone:";
    }

    /**
     * prompt_Email  generates a standard output prompt for the Email to be entered
     */
    public String promptEmail() {

        return "Email:";
    }

    /**
     * Method creates standard println output prompts and inputs for creating a new AddressEntry
     * @return
     */
    public AddressEntry promptNewAddressEntry() {
        System.out.println(promptFirstName());
        String fname = keyboard.nextLine();
        System.out.println(promptLastName());
        String lname = keyboard.nextLine();
        System.out.println(promptStreet());
        String street = keyboard.nextLine();
        System.out.println( promptCity());
        String city = keyboard.nextLine();
        System.out.println(promptState());
        String state = keyboard.nextLine();
        System.out.println(promptZip());
        String zip = keyboard.nextLine();
        System.out.println(promptEmail());
        String email = keyboard.nextLine();
        System.out.println(promptTelephone());
        String phone = keyboard.nextLine();

        AddressEntry singleEntry = new AddressEntry(fname, lname, street, city, state, Integer.parseInt(zip), email, phone);

        return singleEntry;
    }

}