package address.data;

import java.util.Objects;

/**
 * Main class for AddressEntry includes constructors and data manipulation methods equals and hashCode
 */
public class AddressEntry {
    /**
     * Variable for First Name for individual AddressEntry
     */
    private String firstName;
    /**
     * Variable for Last Name for individual AddressEntry
     */
    private String lastName;
    /**
     * Variable for Street info for individual AddressEntry
     */
    private String street;
    /**
     * Variable for City info for individual AddressEntry
     */
    private String city;
    /**
     * Variable for State info for individual AddressEntry
     */
    private String state;
    /**
     * Variable for Phone Number info for individual AddressEntry
     */
    private String phone;
    /**
     * Variable for Email info for  individual AddressEntry
     */
    private String email;
    /**
     * Variable for Zip Code info for individual AddressEntry
     */
    private int zip;

    /**
     * Default constructor, initializes class variables
     */
    public AddressEntry() {
        firstName = "";
        lastName = "";
        street = "";
        city = "";
        state = "";
        phone = "";
        email = "";
        zip = 0;
    }

    /**
     * Additional constructor that allows for inputs upon construction of an AddressEntry
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.street= street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * toString returns the information stored in an AddressEntry as a single string that can be printed out to the screen
     */
    public String toString() {
        return firstName + "\n"
                + lastName + "\n"
                + street + "\n"
                + city + ", " + state + " " + zip + "\n"
                + phone + "\n"
                + email + "\n";
    }

    /**
     * setter for the firstName variable
     */
     void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getter for the firstName variable
     */
    String getFirstName() {
        return firstName;
    }

    /**
     * setter for the lastName variable
     */
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * getter for the lastName variable
     */
    String getLastName() {

        return lastName;
    }

    /**
     * setter for the city variable
     */
    void setCity(String city) {

        this.city = city;
    }
    /**
     * getter for the city variable
     */
    String getCity() {

        return city;
    }

    /**
     * setter for the state variable
     */
    void setState(String state) {

        this.state = state;
    }
    /**
     * getter for the state variable
     */
    String getState() {

        return state;
    }

    /**
     * setter for the street variable
     */
    void setStreet(String street) {

        this.street = street;
    }
    /**
     * getter for the street variable
     */
    String getStreet() {

        return street;
    }

    /**
     * setter for the zip variable
     */
    void setZip(int zip) {

        this.zip = zip;
    }
    /**
     * getter for the zip variable
     */
    int getZip() {

        return zip;
    }

    /**
     * setter for the phone variable
     */
    void setPhone(String phone) {

        this.phone = phone;
    }
    /**
     * getter for the phone variable
     */
    String getPhone() {

        return phone;
    }

    /**
     * setter for the email variable
     */
    void setEmail(String email) {

        this.email = email;
    }
    /**
     * getter for the email variable
     */
    String getEmail() {

        return email;
    }

    /**
     * Overloaded equals method works in tandem with overloaded hashCode method to ensure that the data structure only allows
     * unique entries
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        AddressEntry e = (AddressEntry) o;
        return Objects.equals(street, e.street) && Objects.equals(lastName, e.lastName) && Objects.equals(firstName, e.firstName);
    }

    /**
     * Overloaded hashcode method works in tandem with the overloaded equals method to ensure the data structure only allows unique entries
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(street, lastName, firstName);
    }

}
