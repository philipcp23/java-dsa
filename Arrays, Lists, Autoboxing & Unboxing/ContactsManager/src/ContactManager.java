import java.util.*;

public class ContactManager {
    Contacts[] myContacts;
    private int numOfContacts;

    ContactManager() {
        this.numOfContacts = 0;
        this.myContacts = new Contacts[500];
    }

    void addContact(Contacts contacts) {
        myContacts[numOfContacts] = contacts;
        numOfContacts++;

    }

    public Contacts searchContact(String searchName) {
        for (int i = 0; i < numOfContacts; i++) {
            if (myContacts[i].name.equals(searchName)) {
                return myContacts[i];
            }
        }
    }


}
