package contactsmanager;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ViewContacts extends ContactsManagerApp {
    public static void view_contact() throws IOException, FileNotFoundException {
        Path file = Paths.get("contactsmanager/Address_Book", "contacts.txt");
        List<String> list = Files.readAllLines(file);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}