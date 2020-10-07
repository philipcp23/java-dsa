import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists!");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact contact, Contact newContact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists. No updates made.");
            return false;
        }
        this.contacts.set(foundPosition, newContact);
        System.out.println(contact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    //remove contact
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String name) {
        int index = 0;
        for(Contact contact : contacts) {
            contact = this.contacts.get(index);
            if (contact.getName().equals(name)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.contacts.get(position);
        }
        return null;
    }

    //query contact
    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    //print contact
    public void printContacts() {
        int index = 0;
        System.out.println("Contact List");
        for (Contact contact : contacts) {
            contact = this.contacts.get(index);
            System.out.println((index + 1) + "." + contact.getName() +
                    " | Mobile: " + contacts.get(index).getPhoneNumber());
            index ++;
        }
    }

}
