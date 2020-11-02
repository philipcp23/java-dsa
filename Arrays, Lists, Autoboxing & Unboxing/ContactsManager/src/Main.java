public class Main {

    public static void main(String[] args) {
        ContactManager cm = new ContactManager();
        Contacts jenny = new Contacts();
        Contacts phil = new Contacts();

        jenny.name = "Jenny";
        jenny.email = "Jenny@Contacts.com";
        jenny.phoneNumber = "8675304";

        phil.name = "Phil";
        phil.email = "Phil.Contacts.com";
        phil.phoneNumber = "9124950";

        cm.addContact(jenny);
        cm.addContact(phil);

        Contacts search = cm.searchContact("Jenny");
        System.out.println("Name: " + search.name + "\nPhone Number: " + search.phoneNumber + "\nEmail: " + search.email);


    }
}
