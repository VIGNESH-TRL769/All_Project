package project.hashing;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;
public class Hashmap
{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    protected void hashmap()
    {
        Scanner input=new Scanner(System.in);
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("1915058", "vignesh");
            hashMap.put("1915059", "vicky");
            hashMap.put("1915060", "sanjai");
            hashMap.put("1915061", "Laxman");
            String hash = "" + hashMap;
            Log.info(hash);
            String print = "" + hashMap.size();
            String p1 = "Size: " + print;
            Log.info(p1);
            String key = "" + hashMap.keySet();
            Log.info(key);
            String val = "" + hashMap.values();
            Log.info(val);
            hashMap.remove("1915060");
            hash = "" + hashMap;
            Log.info(hash);
            hashMap.replace("1915058", "vignesh vicky");
            hash = "" + hashMap;
            Log.info(hash);
            Log.info(hashMap.get("1915059"));
        } catch (Exception e)
        {
            String value1 = "Please Enter Valid Inputs:" + e;
            Log.info(value1);
            input.nextLine();
        }
    }
}