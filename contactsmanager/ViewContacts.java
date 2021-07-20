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
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }


//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getParentFile());
//        System.out.println(file.exists());
//        file.createNewFile();
//        BufferedReader reader = new BufferedReader(new FileReader(file));
//        String currentLine;
//
//        boolean first = false;
//        String[] fields = new String[0];
//
//        while ((currentLine = reader.readLine()) != null) {
//            if (!first) {
//                fields = currentLine.split(",");
//                first = true;
//            } else {
//                System.out.println("------------");
//                String[] info = currentLine.split(",");
//                for (int i = 0; i < fields.length; i++){
//                    System.out.println(fields[i] +":"+ info[i]);
//                }
//            }
//        }
//        System.out.println("----------");
//        reader.close();
//    }

}


