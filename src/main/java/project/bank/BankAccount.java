package project.bank;
import java.util.logging.Logger;
 public class BankAccount
{
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    private final String name;
    private final Long accountNumber;
    Double balance=0.0D;
    protected BankAccount(String name,Long accountNumber)
    {
        this.name=name;
        this.accountNumber=accountNumber;
    }
    protected void getAccountDetails()
    {
        String print="\nHolderName:"+name+"\nAccountNumber:"+accountNumber+"\nBalance:"+balance+"0\n";
        LOGGER.info(print);
    }
    protected void deposite(int amount)
    {
        balance+=amount;
        String print="\nDeposite of Amount Rs "+amount+".00 is Successfully\n";
        LOGGER.info(print);
    }
    protected void withdraw(int amount)
    {
        if(balance-amount>=100)
        {
            balance-=amount;
            String print="\nWithdraw of Amount Rs:"+amount+".00 is Successfully\n";
            LOGGER.info(print);
        }
        else
            LOGGER.info("\nWithdrawal Limit Above Rs:100");
    }

}
