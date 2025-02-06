import java.util.ArrayList;
import java.util.Objects;

public class MobilePhoneProject {

    public static class Contact {
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public static Contact createContact(String name, String phoneNumber) {
            return new Contact(name, phoneNumber);
        }
    }

    public static class MobilePhone {
        private ArrayList<Contact> myContacts;
        private String myNumber;

        public MobilePhone(String myNumber) {
            this.myNumber = myNumber;
            this.myContacts = new ArrayList<>();
        }

        public boolean addNewContact(Contact contact) {
            if (findContact(contact.getName()) >= 0) {
                System.out.println("The contact already exists.");
                return false;
            }
            myContacts.add(contact);
            System.out.println("Contact successfully added.");
            return true;
        }

        public boolean updateContact(Contact existingContact, Contact newContact) {
            int foundPosition = findContact(existingContact.getName());
            if (foundPosition < 0) {
                System.out.println("The contact you are looking for does not exist.");
                return false;
            }
            myContacts.set(foundPosition, newContact);
            System.out.println("Contact successfully updated.");
            return true;
        }

        public boolean removeContact(Contact contact) {
            int foundPosition = findContact(contact.getName());
            if (foundPosition < 0) {
                System.out.println("No contact found for the provided details.");
                return false;
            }
            myContacts.remove(foundPosition);
            System.out.println("Contact successfully removed.");
            return true;
        }

        public Contact queryContact(String name) {
            int foundPosition = findContact(name);
            if (foundPosition < 0) {
                System.out.println("No contact found.");
                return null;
            }
            return myContacts.get(foundPosition);
        }

        public void printContacts() {
            System.out.println("Contact List:");
            for (int i = 0; i < this.myContacts.size(); i++) {
                System.out.println((i + 1) + ". " +
                        this.myContacts.get(i).getName() + " -> " +
                        this.myContacts.get(i).getPhoneNumber());
            }
        }

        private int findContact(Contact contact) {
            return myContacts.indexOf(contact);
        }

        private int findContact(String name) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (Objects.equals(myContacts.get(i).getName(), name)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("9876543210");

        // Add contacts
        mobilePhone.addNewContact(Contact.createContact("Bob", "31415926"));
        mobilePhone.addNewContact(Contact.createContact("Alice", "16180339"));
        mobilePhone.addNewContact(Contact.createContact("Tom", "11235813"));
        mobilePhone.addNewContact(Contact.createContact("Jane", "23571113"));

        // Print contacts
        mobilePhone.printContacts();

        // Update a contact
        Contact oldContact = new Contact("Alice", "16180339");
        Contact newContact = new Contact("Alice", "12345678");
        mobilePhone.updateContact(oldContact, newContact);

        // Print updated contacts
        mobilePhone.printContacts();

        // Query a contact
        Contact queriedContact = mobilePhone.queryContact("Tom");
        if (queriedContact != null) {
            System.out.println("Queried Contact: " + queriedContact.getName() + " -> " + queriedContact.getPhoneNumber());
        }

        // Remove a contact
        mobilePhone.removeContact(new Contact("Bob", "31415926"));

        // Print contacts after removal
        mobilePhone.printContacts();
    }
}