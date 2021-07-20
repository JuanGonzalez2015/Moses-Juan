package contactsmanager;

import java.io.*;
import java.util.Scanner;

public class AddContact extends ContactsManagerApp {
    public static void add_contact() throws IOException, FileNotFoundException {
        File file1 = new File(System.getProperty("user.dir") + "/contactsmanager/Address_Book/contacts.txt");
        BufferedReader reader1 = new BufferedReader((new FileReader(file1)));
        OutputStreamWriter writer1 = new OutputStreamWriter(
                new FileOutputStream(System.getProperty("user.dir") + "/contactsmanager/Address_Book/contacts.txt", true), "UTF-8");
        BufferedWriter writer = new BufferedWriter(writer1);
        Scanner input = new Scanner(System.in);
        boolean duplicate, valid;
        String currentLine1;
        String f1 = "";
        String f2 = "";
        String f3 = "";
        String str;
        System.out.println("Type First Name: ");
        f1 = input.nextLine();
        System.out.println("Type Last Name: ");
        f2 = input.nextLine();
        do {
            duplicate = false;
            valid = true;
            System.out.println("Type Phone Number: ");
            f3 = input.nextLine();

//            while ((currentLine1 = reader1.readLine()) != null) {
//                String[] words1 = currentLine1.split(",");
//                if (words1[2].equals((String.valueOf(f3)))) {
//                    duplicate = true;
//                    System.out.println("That number already exists");
//                }
//            }
            reader1 = new BufferedReader(new FileReader(file1));

        } while (valid == false);
        if (f1.equals("") || f2.equals("") || f3.equals("")) {
            System.out.println("Input you gave was incorrect: ");
        } else {
            str = f1 + "," + f2 + "," + String.valueOf(f3) + ",";
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file1, true)));
            out.println(str);
            out.close();
        }

        writer.close();
        reader1.close();
    }


}

