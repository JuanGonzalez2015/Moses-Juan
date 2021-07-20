package contactsmanager;

import java.io.*;
import java.util.Scanner;


public class Search {

    public static void search_contacts() throws IOException, FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String firstName, lastName;
        System.out.println("Give First name: ");
        firstName = input.nextLine();
        System.out.println("Give Last name: ");
        lastName = input.nextLine();
        File file = new File(System.getProperty("user.dir") + "/contactsmanager/Address_Book/contacts.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine;
        boolean first = false;
        String[] fields = new String[0];
        while ((currentLine = reader.readLine()) != null) {
            if (!first) {
                fields = currentLine.split(",");
                first = true;
            } else {
                String[] info = currentLine.split(",");
                if (info[0].equals(firstName) && info[1].equals(lastName)) {
                    System.out.println("----Here is contact info----");
                    for (int i = 0; i < fields.length; i++) {
                        System.out.println(fields[i] + ": " + info[i]);
                    }
                } else if (info[0].equals(firstName) && !info[1].equals(lastName)) {
                    System.out.println("----Here is contact info----");
                    for (int i = 0; i < fields.length; i++) {
                        System.out.println(fields[i] + ": " + info[i]);
                    }
                } else if (!info[0].equals(firstName) && info[1].equals(lastName)) {
                    System.out.println("----Here is contact info----");
                    for (int i = 0; i < fields.length; i++) {
                        System.out.println(fields[i] + ": " + info[i]);
                    }
                }

            }
        }
        System.out.println("-------------------");
        reader.close();
        search_contacts();
    }
}

