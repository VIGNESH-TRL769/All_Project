package project.fileread;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;


public class Fileread
{
    public static final Logger Log = Logger.getLogger(("InfoLogging"));
    private Fileread()
    {
        Log.info("---FileRead---");
    }

    public static void filereadTask() throws IOException
    {

            Scanner input = new Scanner(System.in);
            FileHandle f = new FileHandle();
            Log.info("File Created.....");
            f.path();
            Log.info("Enter the User input string:");
            String str = input.nextLine();
            f.write(str);
            Log.info("File is writed.....");
            Log.info("File is Readed.....");
            String data = f.read();
            Log.info("File is sorted.....");
            f.sort(data);
            f.display();

    }
}


