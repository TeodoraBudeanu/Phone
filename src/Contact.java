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
}
