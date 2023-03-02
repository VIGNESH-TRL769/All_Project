package project.collections;
import java.util.Scanner;
import java.util.logging.Logger;
public class Collections
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    private Collections()
    {
        Log.info("---Collections---");
    }

    public static void collectionsTask()
    {
        Scanner input=new Scanner(System.in);

        while(true)
        {

            Log.info("\n1.LinkedListOperation\n2.Array\n3.ArrayListOperation\n4.Exit\nEnter The Choice:");
            int key=input.nextInt();
            switch (key)
            {
                case 1 ->
                {
                    LinkedListOperation listOperation=new LinkedListOperation();
                    listOperation.linkedlistOperation();
                }
                case 2 ->
                {
                    Array array=new Array();
                    array.array();
                }
                case 3 ->
                {
                    ArrayListOperation arrayListOperation=new ArrayListOperation();
                    arrayListOperation. arraylistOperation();
                }
                case 4 ->
                {
                    return;
                }
                default -> Log.info("Please Enter Valid Input");
            }

        }
    }
}
