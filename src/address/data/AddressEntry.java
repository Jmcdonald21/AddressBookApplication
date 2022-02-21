package address.data;

import java.util.Objects;

public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String phone;
    private String email;
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
     * AddressEntry creates a new AddressEntry that can be added into AddressBook
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

    @Override
    public int hashCode() {
        return Objects.hash(street, lastName, firstName);
    }

}
