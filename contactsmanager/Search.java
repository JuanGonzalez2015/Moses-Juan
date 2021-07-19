package contactsmanager;

import java.io.*;
import java.util.Scanner;

public class Search {

        public static void search_contacts() throws IOException, FileNotFoundException {
            Scanner input = new Scanner(System.in);
            String f1, f2;
            System.out.println("Give First name: ");
            f1 = input.nextLine();
            System.out.println("Give Last name: ");
            f2 = input.nextLine();
            File file = new File(System.getProperty("user.dir") + "/contactsmanager/Address_Book/contacts.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine;
            boolean first = false;
            String[] fields = new String[0];
            while ((currentLine = reader.readLine()) != null) {
                if (!first) {
                    fields = currentLine.split(",");
                    first = true;
                } else {//if both fields that the user gave match a contact i show contact's info
                    String[] info = currentLine.split(",");
                    if (info[0].equals(f1) && info[1].equals(f2)) {
                        System.out.println("----Here is contact info----");
                        for (int i = 0; i < fields.length; i++) {
                            System.out.println(fields[i] + ": " + info[i]);
                        }
                    } else if (info[0].equals(f1) && !info[1].equals(f2)) {//if one of the fields that the user gave match a contact i show contact's info
                        System.out.println("----Here is contact info----");
                        for (int i = 0; i < fields.length; i++) {
                            System.out.println(fields[i] + ": " + info[i]);
                        }
                    } else if (!info[0].equals(f1) && info[1].equals(f2)) {//if one of the fields that the user gave match a contact i show contact's info
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
//adding

