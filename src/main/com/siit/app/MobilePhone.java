package main.com.siit.app;

public interface MobilePhone {

    void addContact(String i, String phoneNo, String firstName, String lastName);

    void listContacts();

    void sendMessage(String phoneNo, String messageContent);

    void listMessages(String phoneNo);

    void call(String phoneNo);

    void viewHistory();

}