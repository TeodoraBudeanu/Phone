public class Main {
    public static void main(String[] args) {

//        Phone phone1 = new Samsung();
        Phone phone = new S6(123456789012345L); // IMEI code is an unique 15 digit number
        phone.setColor("red");
        phone.setMaterial("aluminium");

        System.out.println(phone + "\n");

        phone.addContact("1", "0745123444", "Ana", "Ionescu");
        phone.addContact("2", "0746321888", "Maria", "Popescu");
        phone.listContacts();

        phone.sendMessage("0745123444", "This is a message sent to the first contact.");
        phone.sendMessage("0746321888", "This is a message sent to the second contact.");
        phone.sendMessage("0745123444", "This is the second message sent to the 1st contact.");
        phone.listMessages("0745123444");

        phone.call("0746321888");
        phone.call("0746321888");
        phone.call("0745123444");
        phone.viewHistory();


        System.out.println(phone);
    }
}
