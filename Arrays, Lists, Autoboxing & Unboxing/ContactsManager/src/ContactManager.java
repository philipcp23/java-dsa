import java.util.*;

public class ContactManager {
    private Contacts[] myContacts;
    private int numOfContacts;

    ContactManager() {
        this.numOfContacts = 0;
        this.myContacts = new Contacts[500];
    }

    void addContact(Contacts contacts) {
        myContacts[numOfContacts] = contacts;
        numOfContacts++;

    }

    public String searchContact(String searchName) {
        for (int i = 0; i < numOfContacts; i++) {
            if ()
        }
    }


}
