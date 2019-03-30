package main.com.siit.app;

public class Message {

    private String phoneNo;
    private String textMessage;

    public Message(String phoneNo, String Message) {
        this.phoneNo = phoneNo;
        this.textMessage = Message;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String toString() {
        return "\"" + textMessage + "\"";
    }

}
