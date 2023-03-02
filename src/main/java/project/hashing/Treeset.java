package project.hashing;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.Comparator;
public class Treeset
{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    protected  void tree()
    {
        Scanner input=new Scanner(System.in);
        try {
            TreeSet<String> treeSet = new TreeSet<>();
            treeSet.add("vignesh");
            treeSet.add("vicky");
            treeSet.add("sanjai");
            treeSet.add("raja");
            treeSet.add("sandy");
            treeSet.add("jai");
            String print = "";
            for (String k : treeSet) {
                print = k + "\n";
            }
            Log.info(print);
            String tree = "TreeSet" + treeSet;
            Log.info(tree);
            TreeSet<String> sortedNames = new TreeSet<>(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s2.compareTo(s1);
                }
            });
            sortedNames.addAll(treeSet);
            String stree = "Sorted TreeSet(descending order): " + sortedNames;
            Log.info(stree);
            stree = "Contains vicky => " + treeSet.contains("vicky");
            Log.info(stree);
            treeSet.remove("sandy");
            stree = "TreeSet after removing sandy: " + treeSet;
            Log.info(stree);
            stree = "First data: " + treeSet.first();
            Log.info(stree);
            stree = "Last data: " + treeSet.last();
            Log.info(stree);
            treeSet.pollFirst();
            treeSet.pollLast();
            stree = "TreeSet after pollfirst and polllast: " + treeSet;
            Log.info(stree);
            String size = "Treeset Size: " + treeSet.size();
            Log.info(size);
            treeSet.clear();
            size = "Size: " + treeSet.size();
            Log.info(size);
        }
        catch (Exception e)
        {
            String value1 = "Please Enter Valid Inputs:" + e;
            Log.info(value1);
            input.nextLine();
        }
    }
}
