package project.bank;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;
public class Bank  {
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    private Bank()
    {
        LOGGER.info("---Simple Bank---");
    }

    public static void bankTask()
    {

        Scanner input=new Scanner(System.in);
        LOGGER.info("\nEnter the HolderName:");
        String name=input.nextLine();
        LOGGER.info("\nEnter the AccountNumber:");
        long accountNumber=input.nextLong();
        BankAccount bankAccount=new BankAccount(name,accountNumber);

        while(true)
        {
            try {
                LOGGER.info("\n1.deposite\n2.withdraw\n3.balance\n4.Exit\n");
                LOGGER.info("\nEnter the Choice:");
                int value=input.nextInt();
                int temp1=0;
                switch (value) {
                    case 1 -> {
                        LOGGER.info("\nEnter the deposite Amount:");
                        int depositeAmount = input.nextInt();
                        bankAccount.deposite(depositeAmount);
                    }
                    case 2 -> {
                        LOGGER.info("\nEnter the withdraw Amount:");
                        int withdrawAmount = input.nextInt();
                        if (bankAccount.balance >= 100)
                            bankAccount.withdraw(withdrawAmount);
                        else {
                            String print="\nMinimum Balance Should be Rs:100 You having Balance Amount=" + bankAccount.balance + "0 ";
                            LOGGER.info(print);
                        }
                    }
                    case 3 -> bankAccount.getAccountDetails();
                    case 4 -> temp1 = 1;
                    default ->LOGGER.info("\nInvalid Choice Tryagin\n");
                }
                if(temp1==1)
                {
                    LOGGER.info("\n------Thank You------");
                    return;
                }
            }

            catch (InputMismatchException e)
            {
                String value="Please Enter Valid Inputs:"+e;
                LOGGER.info(value);
                input.nextLine();
            }
        }

    }
}