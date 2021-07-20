package contactsmanager;

import javax.print.DocFlavor;
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
        String firstName = "";
        String lastName = "";
        String phoneNumber = "";
        String str;
        System.out.println("Type First Name: ");
        firstName = input.nextLine();
        System.out.println("Type Last Name: ");
        lastName = input.nextLine();
        do {
            duplicate = false;
            valid = true;
            System.out.println("Type Phone Number: ");
            phoneNumber = input.nextLine();

//            while ((currentLine1 = reader1.readLine()) != null) {
//                String[] words1 = currentLine1.split(",");
//                if (words1[2].equals((String.valueOf(f3)))) {
//                    duplicate = true;
//                    System.out.println("That number already exists");
//                }
//            }
            reader1 = new BufferedReader(new FileReader(file1));

        } while (valid == false);
        if (firstName.equals("")  || lastName.equals("") || phoneNumber.equals("")) {
            System.out.println("Input you gave was incorrect: ");
        } else {
            str = firstName + "," + lastName + "," + String.valueOf(phoneNumber) + ",";
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file1, true)));
            out.println(str);
            out.close();
        }

        writer.close();
        reader1.close();
    }


}

