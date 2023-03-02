package project.fileread;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Logger;

public class FileHandle
{
    public static final Logger Log = Logger.getLogger(("InfoLogging"));
    ArrayList<Map.Entry<String, Integer> > listOfEntry;
    File path;
    protected void path()
    {
        path = new File("FileRead.txt");
    }
    protected String read() throws IOException {
        String readData =""+path;
        return new String(Files.readAllBytes(Paths.get(readData)));
    }
    protected void write(String value) throws IOException {
        FileWriter fileWrite = new FileWriter(path);
        for (int i = 0; i < value.length(); i++)
            fileWrite.write(value.charAt(i));
        fileWrite.flush();
        fileWrite.close();
    }
    protected void sort(String data)
    {
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = data.split(" ");
        for (String word : words) {
            Integer integer = hashMap.get(word);
            if (integer == null)
                hashMap.put(word, 1);
            else
            {
                hashMap.put(word, integer + 1);
            }
        }
        Set<Map.Entry<String, Integer> > entrySet = hashMap.entrySet();
        listOfEntry = new ArrayList<>(entrySet);
        listOfEntry.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    }
    protected void display()
    {
        String print=listOfEntry.toString();
        Log.info(print);
    }
}
