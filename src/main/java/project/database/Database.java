package project.database;
import java.util.logging.Logger;
public class Database {
    static int temp=0;
    static int v=0;
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    static Database dbObject=null;
    private Database() {
    }

    protected static Database getInstance()
    {

        if(v == 0)
        {
            Log.info("New Connection");
            dbObject = new Database();
            v=1;
        }
        else
        {

            Log.info("Already Connection Exists");
        }
        return dbObject;
    }

    protected static void getConnection()
    {
        temp=1;
        String print="Connected Successfully:"+dbObject;
        Log.info(print);
    }
    protected static void newConnection()
    {
        temp=0;
        v=0;
        dbObject=getInstance();
        String print="New Connection Initiziated:"+dbObject;
        Log.info(print);
    }
    protected static void viewStatus()
    {
        if(temp==1)
        {
            Log.info("Connection ON");
        }
        else
        {
            Log.info("Connection OFF");
        }
    }
    protected  static void closeConnection()
    {
        temp=0;
        v=0;
        String print="Connection closed";
        Log.info(print);
    }

}
