/*
  Create a program that implements a simple mobile phone wih the following capabilities.
  Able to store, modify, remove and query contact names.
  You will want to create a separate class for Contacts(name and phone number).
  Create a master class (MobilePhone) that holds the ArrayList of Contacts
  The MobilePhone class has the functionality listed above.
  Add a menu of options that are available.
  Options: Quit, print, list of contacts, add new contact, update existing contact, remove contact
  and search/find contact.
  When adding or updating be sure to check if the contact already exists (use name)
  Be sure not to expose the inner workings of the ArrayList to MobilePhone
  e.g. no ints, no .get(i) etc
  MobilePhone should do everything with Contact objects only.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("52345 2345");


    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down...\n\n (|)");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existing = mobilePhone.queryContact(name);
        if (existing == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String nameChange = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String numberChange = scanner.nextLine();
        Contact newContact = Contact.createContact(nameChange, numberChange);
        if (mobilePhone.updateContact(existing, newContact)) {
            System.out.println("Updated Record");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existing = mobilePhone.queryContact(name);
        if (existing == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existing.getName() + " phone number is " + existing.getPhoneNumber());
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existing = mobilePhone.queryContact(name);
        if (existing == null) {
            System.out.println("Contact not found.");
            return;
        }

        if (mobilePhone.removeContact(existing)) {
            System.out.println("Successfully deleted");
        } else
            System.out.println("Error deleting contact.");
    }


    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: " + name + " | Mobile: " + phone);
        }
        else {
            System.out.println(name + " already exists!");
        }
    }


    private static void printActions() {
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }
}
