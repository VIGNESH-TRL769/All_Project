package project.calculator;
import java.util.Scanner;
import java.util.logging.Logger;
public class Calculator
{
    public static final Logger Log=Logger.getLogger(("InfoLogging"));
    public static void calculatorTask()
    {
        Addition add=new Addition();
        Subtraction sub=new Subtraction();
        Division div=new Division();
        Multiplication mul=new Multiplication();
        Scanner input=new Scanner(System.in);
        Log.info("Enter the Value:");
        int r= input.nextInt();
        int value=0;
        while(true)
        {
            try {
                Log.info("\n1.Addtion(+)\n2.Substration(-)\n3.Multiplication(*)\n4.Division(/)\n5.Result\n6.Exit\nEnter The Choice:\n");
                int key = input.nextInt();
                if (key < 5) {
                    Log.info("Enter the Value:");
                    int val = input.nextInt();
                    add.setValue(val);
                    value = add.getValue();
                }
                switch (key) {
                    case 1 -> r = add.calc(value, r);
                    case 2 -> r = sub.calc(value, r);
                    case 3 -> r = mul.calc(value, r);
                    case 4 -> r = div.calc(value, r);
                    case 5 -> add.display(r);
                    case 6 -> {
                        Log.info("-----Thannk You-----");
                        return;
                    }
                    default -> Log.info("Please Enter Valid Details");
                }
            }
            catch(Exception e)
            {
                String value1 = "Please Enter Valid Inputs:" + e;
                Log.info(value1);
                input.nextLine();
            }


        }
    }
}