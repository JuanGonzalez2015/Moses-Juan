package contactsmanager;

import java.io.IOException;
import java.util.Scanner;

public class ContactsManagerApp {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int exit = 5;
        int answer;
        do {
//            1. View contacts.txt.
//            2. Add a new contact.
//            3. Search a contact by name.
//            4. Delete an existing contact.
//            5. Exit.

            System.out.println("Enter '1' View contacts.txt");
            System.out.println("Enter '2' Add a new contact");
            System.out.println("Enter '3' Search a contact by name");
            System.out.println("Enter '4' Delete an existing contact");
            System.out.println("Enter '5' Exit");
            try {
                answer = input.nextInt();
            } catch (NumberFormatException e) {
                answer = -1;
            }
            if (answer == 1)
                ViewContacts.view_contact();
            else if (answer == 2)
                AddContact.add_contact();
            else if (answer == 3)
                Search.search_contacts();
//            else if (answer == 4)
//                Delete.delete_contacts();

        } while (answer == exit);
        System.out.println("New Person was added to your Address Book");
    }

}
