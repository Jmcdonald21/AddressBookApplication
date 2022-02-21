package address.data;

import java.io.*;
import java.util.*;
import java.util.Scanner;

/**
 * AddressBook class holds a collection of objects of the class AddressEntry using an ArrayList
 */
public class AddressBook {

    Set<AddressEntry> AddressEntryList = new HashSet<>();

    /**
     * The list method Iterates through the AddressEntryList ArrayList and uses the toString() method from the AddressEntry class to print them out
     */
    public void list() {

        List<AddressEntry> list = new ArrayList<>(AddressEntryList);
        list.sort(Comparator.comparing(AddressEntry::getLastName, String.CASE_INSENSITIVE_ORDER));
        int count = 1;

        for (AddressEntry addressEntry : AddressEntryList) {
            System.out.println(count + ": " + addressEntry);
            count++;
        }
    }

    /**
     * The add method takes individual AddressEntries and adds them to the AddressEntryList
     */
    public void add(AddressEntry Entry) {

        AddressEntryList.add(Entry);

    }

    /**
     * The remove method takes removes a specified entry from AddressEntryList
     */
    public void remove(String lastName) {
        int count = 0;
        Scanner keyboard = new Scanner(System.in);
        ArrayList<AddressEntry> removalList = new ArrayList<>();
        for (AddressEntry addressEntry : AddressEntryList) {
            if (addressEntry.getLastName().contains(lastName)) {
                removalList.add(addressEntry);
            }
        }
        if (removalList.size() > 1) {
            System.out.println("The following entries were found in the address book, select number of entry you wish to remove:\n");
            for (AddressEntry removalEntry : removalList) {
                count++;
                System.out.println(count + ": " + removalEntry);
            }
            int indexInput = keyboard.nextInt();

            System.out.println("Hit 'y' to remove the following entry or 'n' to return to main menu:");
            System.out.println(removalList.get(indexInput - 1) + "\n");

            char input = keyboard.next().charAt(0);

            switch (input) {
                case 'y':
                    AddressEntryList.removeIf(AddressEntry -> Objects.equals(AddressEntry.getLastName(), removalList.get(indexInput - 1).getLastName())
                            && Objects.equals(AddressEntry.getStreet(), removalList.get(indexInput - 1).getStreet())
                            && Objects.equals(AddressEntry.getFirstName(), removalList.get(indexInput - 1).getFirstName()));
                    break;
                case 'n':
                    break;
            }

        } else {
            for (AddressEntry removalEntry : removalList) {
                System.out.println("The following entry was found in the address book:\n");
                System.out.println(removalEntry);
                System.out.println("Hit 'y' to remove the following entry or 'n' to return to main menu:");
                char input = keyboard.next().charAt(0);
                switch (input) {
                    case 'y':
                        AddressEntryList.removeIf(AddressEntry -> Objects.equals(AddressEntry.getLastName(), removalList.get(0).getLastName())
                                && Objects.equals(AddressEntry.getStreet(), removalList.get(0).getStreet())
                                && Objects.equals(AddressEntry.getFirstName(), removalList.get(0).getFirstName()));
                        break;
                    case 'n':
                        break;
                }
            }
        }
    }

    /**
     * The find method prints a specified entry from AddressEntryList
     */
    public void find(String lastName) {
        int count = 0;

        for (AddressEntry addressEntry : AddressEntryList) {
            if(addressEntry.getLastName().contains(lastName)) {
                count++;
                System.out.println(count + ": " + addressEntry);
            }
        }
    }

    /**
     * Reads data from a file and inputs it into AddressEntryList
     * uses format firstName\nlastName\naddress\ncity\nstate\nzip\nemail\nphone\nemail
     */
    public void readFromFile(String filename) {
        try {
            //open file
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;

            //keep count of number of entries from file
            int count = 0;

            //read from the file into address book entry
            while((line = br.readLine()) != null) {
                this.add(new AddressEntry(line, br.readLine(), br.readLine(), br.readLine(), br.readLine(),
                        Integer.parseInt(br.readLine()), br.readLine(),br.readLine()));

                count++;
            }
            //prints the count on the number of entries read in from file
            System.out.println("\nProcessed " + count + " new Address Entries From File");
        }
        catch (FileNotFoundException e) {
            //prints message for file not found exception
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
