public abstract class Phone implements MobilePhone {

    public abstract String getColor();

    public abstract void setColor(String color);

    public abstract String getMaterial();

    public abstract void setMaterial(String material);

    @Override
    public void addContact(String i, String phoneNo, String firstName, String lastName) {

    }

    @Override
    public void listContacts() {

    }

    @Override
    public void sendMessage(String phoneNo, String messageContent) {

    }

    @Override
    public void listMessages(String phoneNo) {

    }

    @Override
    public void call(String phoneNo) {

    }

    @Override
    public void viewHistory() {

    }
}
