package main.com.siit.app;

import java.util.Objects;

public class Contact {

    private String index;
    private String phoneNo;
    private String firstName;
    private String lastName;


    public Contact(String index, String phoneNo, String firstName, String lastName) {
        this.index = index;
        this.phoneNo = phoneNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return index + " " + phoneNo + " " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return  Objects.equals(phoneNo, contact.phoneNo) &&
                Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastName, contact.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, phoneNo, firstName, lastName);
    }
}
