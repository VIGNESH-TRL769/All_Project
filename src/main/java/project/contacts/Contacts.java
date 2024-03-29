package project.contacts;
import java.util.Scanner;
import java.util.logging.Logger;
public class Contacts
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    private Contacts()
    {
        Log.info("---Contacts---");
    }

    public static void contactsTask() {
        Scanner input=new Scanner(System.in);
        ContactLinkedList linkedList=new ContactLinkedList();
        while (true) {
            try {
                Log.info("\n1.insert\n2.delete\n3.search phonenumber\n4.search name\n5.display\n6.Exit\nEnter the choice:");
                int key = input.nextInt();
                switch (key) {
                    case 1 -> {
                        Log.info("Enter the name:");
                        String name = input.next();
                        Log.info("Enter the Phonenumber:");
                        long number = input.nextLong();
                        Log.info("Enter the email:");
                        String email = input.next();
                        linkedList.insert(name, number, email);
                    }
                    case 2 -> {
                        Log.info("Enter the index:");
                        int index = input.nextInt();
                        linkedList.delete(index);

                    }
                    case 3 -> {
                        Log.info("Enter the phonenumber:");
                        long phonenumber = input.nextLong();
                        linkedList.search(phonenumber);
                    }
                    case 4 -> {
                        Log.info("Enter the name:");
                        String name = input.next();
                        linkedList.search(name);
                    }
                    case 5 -> linkedList.display();
                    case 6 -> {
                        return;
                    }
                    default -> Log.info("Please Enter the Valid Option.");
                }
            }
            catch (Exception e)
            {
                    String value1 = "Please Enter Valid Inputs:" + e;
                    Log.info(value1);
                    input.nextLine();
            }
        }
    }
}