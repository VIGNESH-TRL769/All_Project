package project.studenttest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Logger;

public class StudentTest
{
    public static final Logger Log= Logger.getLogger("InfoLogging");
    private StudentTest()
    {
        Log.info("---StudentTest---");
    }

    public static void studentTestTask() {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student;
        while (true)
        {
            try {
                Log.info("\n1.UserInput\n2.Display Status\nEnter the Choice:");
                int key = input.nextInt();
                if (key==1)
                {
                    Log.info("Enter The Name:");
                    String name = input.next();
                    Log.info("Enter The Age:");
                    int age = input.nextInt();
                    Log.info("Enter The Gpa:");
                    float gpa = input.nextFloat();
                    if (gpa < 10 && gpa > 0) {
                        student = new Student(name, age, gpa);
                        arrayList.add(student);
                    } else {
                        Log.info("Please Enter Valid Gpa 1 to 10");
                    }
                }
                else if(key==2)
                {
                    break;
                }
                else
                {
                    Log.info("Please Enter Valid Input");
                }
            } catch (Exception e) {
                String excep = String.valueOf(e);
                Log.info(excep);
                input.nextLine();
            }
        }
        Log.info("Display The Before Sort StudentTest:");
        for (Student iterator : arrayList)
        {
            String print="Name:" + iterator.getName() + " Age:" + iterator.getAge() + " GPA:" + iterator.getGpa();
            Log.info(print);
        }
        Log.info("\n\nDisplay The After Sort StudentTest:");
        Collections.sort(arrayList, (o1, o2) -> Double.compare(o2.getGpa(), o1.getGpa()));
        for (Student iterator : arrayList)
        {
            String print="Name:" + iterator.getName() + " Age:" + iterator.getAge() + " GPA:" + iterator.getGpa();
            Log.info(print);
        }
    }
}