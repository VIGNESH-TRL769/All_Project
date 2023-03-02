package project.studentgrade;
import java.util.Scanner;
import java.util.logging.Logger;

public class Studentgrade {
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void studentgrade()
    {
        Scanner input = new Scanner(System.in);
        try {
            float gpa;
            LOGGER.info("Enter the Student Name:");
            String name = input.nextLine();
            while (true) {
                LOGGER.info("Enter the GPA:");
                gpa = input.nextFloat();
                if (gpa > 0 && gpa <= 10) {
                    break;
                } else {
                    LOGGER.info("Please enter Valid GPA");
                }
            }
            LOGGER.info("Enter the gradeLevel:");
            String grade = input.next();
            Student student = new Student(name, gpa, grade);
            int temp = 0;
            do {
                LOGGER.info("\n1.Update\n2.CheckData\n3.Exit\nEnter the Choice:");
                int key = input.nextInt();
                switch (key) {
                    case 1 -> {
                        LOGGER.info("Enter the GPA:");
                        float value = input.nextFloat();
                        if (value > 0 && value <= 10)
                            student.update(value);
                        else
                            LOGGER.info("please enter valid GPA");
                    }

                    case 2 -> {
                        String content = student.display();
                        LOGGER.info(content);
                    }
                    default -> {
                        temp = 1;
                        LOGGER.info("---Thank You---");
                    }
                }
            } while (temp != 1);
        }
        catch (Exception e)
        {
            String value1 = "Please Enter Valid Inputs:" + e;
            LOGGER.info(value1);
            input.nextLine();
        }
    }
}