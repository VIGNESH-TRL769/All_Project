package project.tictactoe;
import java.util.logging.Logger;
class Check
{
    public static final Logger Log = Logger.getLogger(("InfoLogging"));
    protected void display(char[][] array)
    {
        String s;
        StringBuilder sb = new StringBuilder("\n");
        for (char[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                sb.append(ints[j]+" ");
            }
            sb.append("\n");
        }
        s = sb.toString();
        Log.info(s);
    }
    protected boolean rowCheck(char[][] array)
    {

        for (char[] ints : array) {
            int rc = 0;
            int cc = 0;
            for (int j = 0; j < array.length; j++) {
                if (ints[j] == 'X') {
                    rc++;
                } else if (ints[j] == 'O') {
                    cc++;
                }
            }
            if (rc == array.length) {
                Log.info("----Player-1----win\n");
                return true;
            } else if (cc == array.length) {
                Log.info("----Player-2 win----\n");
                return true;
            }
        }
        return false;

    }
    protected boolean colCheck(char[][] array)
    {

        for(int i=0;i<array.length;i++)
        {
            int rc=0;
            int cc=0;
            for (char[] ints : array) {
                if (ints[i] == 'X') {
                    rc++;
                } else if (ints[i] == 'O') {
                    cc++;
                }
            }
            if(rc==array.length)
            {
                Log.info("-----Player-1 win-----\n");
                return true;
            }
            else if(cc==array.length)
            {
                Log.info("-----Player-2 win-----\n");
                return true;
            }
        }
        return false;

    }
    protected boolean diagonalChecklr(char[][] array)
    {
        int rc=0;
        int cc=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i][i]=='X')
                rc++;
            else if(array[i][i]=='O')
                cc++;
        }

        if(rc==array.length)
        {
            Log.info("------Player-1 win------\n");
            return true;
        }
        else if(cc==array.length)
        {
            Log.info("------Player-2 win------\n");
            return true;
        }
        return false;
    }
    protected boolean diagonalCheckrl(char[][] array)
    {
        int rc=0;
        int cc=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i][array.length-i-1]=='X')
                rc++;
            else if(array[i][array.length-i-1]=='O')
                cc++;
        }

        if(rc==array.length)
        {
            Log.info("-------Player-1 win-------\n");
            return true;
        }
        else if(cc==array.length)
        {
            Log.info("-------Player-2 win-------\n");
            return true;
        }
        return false;
    }


}
