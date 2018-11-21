import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IphoneX extends Apple {

    private Map<String, String> myContacts = new HashMap<>();
    private ArrayList<Contact> contacts = new ArrayList<>();
    private ArrayList<Message> messages = new ArrayList<>();
    private ArrayList<Call> calls = new ArrayList<>();

    private long imei;
    private int batteryLife = 75;
    private String color = "Not set";
    private String material = "Not set";

    public IphoneX(long imei) {
        if (imei < Math.pow(10, 14) || imei > Math.pow(10, 15)) {
            System.out.println("The IMEI code you have entered is invalid. Please try again.");
        } else {
            this.imei = imei;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void addContact(String index, String phoneNo, String firstName, String lastName) {
        contacts.add(new Contact(index, phoneNo, firstName, lastName));
        myContacts.put(phoneNo, firstName + " " + lastName);
    }

    @Override
    public void listContacts() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
        System.out.println();
    }

    @Override
    public void sendMessage(String phoneNo, String messageContent) {
        if (batteryLife >= 1) {
            if (messageContent.length() > 500) {
                System.out.println("The message cannot be longer than 500 characters.");
                return;
            }
            messages.add(new Message(phoneNo, messageContent));
            batteryLife--;
        } else {
            System.out.println("Please charge the phone.");
        }
    }

    @Override
    public void listMessages(String phoneNo) {
        for (Message m : messages) {
            if (m.getPhoneNo() == phoneNo) {
                System.out.println(myContacts.get(phoneNo) + " " + m);
            }
        }
        System.out.println();
    }

    @Override
    public void call(String phoneNo) {
        if (batteryLife >= 2) {
            calls.add(new Call(phoneNo));
            batteryLife -= 2;
        } else {
            System.out.println("Please charge the phone.");
        }
    }

    @Override
    public void viewHistory() {
        for (Call c : calls) {
            System.out.println(myContacts.get(c.getPhoneNo()) + c);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "IphoneX{" +
                "imei=" + imei +
                ", batteryLife=" + batteryLife +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
