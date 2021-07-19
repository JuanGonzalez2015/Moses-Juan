package contactsmanager;

import java.io.IOException;
import java.util.Scanner;

public class ContactsManagerApp {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int exit = 5;
        int answer;
        do {
//            1. View contacts.
//            2. Add a new contact.
//            3. Search a contact by name.
//            4. Delete an existing contact.
//            5. Exit.

            System.out.println("Enter '1' View contacts");
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
                View.view_contact();
            else if (answer == 2)
                AddContact.choose_field();
            else if (answer == 3)
                Search.choose_field();
            else if (answer == 4)
                Delete.choose_field();

        } while (answer == exit);
        System.out.println("Exiting out of Contacts Manager");
    }

}
