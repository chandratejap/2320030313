package skill;

public class ContactManagerDemo {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        
        System.out.println("Adding Contacts:");
        manager.addContact(new Contact("Alice", "12345"));
        manager.addContact(new Contact("Jake", "67890"));
        manager.addContact(new Contact("Leo", "54321"));
        System.out.println("All Contacts: " + manager.getAllContacts());

        
        System.out.println("\nFetching Phone Number of Jake:");
        System.out.println("Jake's Phone Number: " + manager.getPhoneNumber("Jake"));

        
        System.out.println("\nUpdating Phone Number of Alice:");
        manager.updatePhoneNumber("Alice", "11111");
        System.out.println("All Contacts after update: " + manager.getAllContacts());

        
        System.out.println("\nRemoving Leo from contacts:");
        manager.removeContact("Leo");
        System.out.println("All Contacts after removal: " + manager.getAllContacts());

        
        System.out.println("\nTrying to add duplicate contact 'Jake':");
        if (!manager.addContact(new Contact("Jake", "67890"))) {
            System.out.println("Duplicate contact 'Jake' was not added.");
        }

        
        System.out.println("\nFinal Contacts List: " + manager.getAllContacts());
    }
}