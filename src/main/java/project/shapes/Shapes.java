package project.shapes;
import java.util.Scanner;
import java.util.logging.Logger;
public class Shapes
{
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    private Shapes()
    {
        LOGGER.info("---Shapes---");
    }

    public static void shapesTask()
    {
        Scanner input=new Scanner(System.in);
        while(true) {
            try {
                int key = 0;
                LOGGER.info("\n1.Triangle\n2.Reactangle\n3.Circle\n4.Exit\nEnter the Choice:");
                int value = input.nextInt();
                switch (value) {
                    case 1 -> {
                        LOGGER.info("Enter the side1 value:");
                        double side1 = input.nextInt();
                        LOGGER.info("Enter the side2 value:");
                        double side2 = input.nextInt();
                        LOGGER.info("Enter the base value:");
                        double base = input.nextInt();
                        Triangle triangle = new Triangle(side1, side2, base);
                        if ((side1 == side2) && (base <= side1) && (base <= side2)) {
                            String print = "Area of the Triangle:" + triangle.area() + "\nPerimeter of the Triangle:" + triangle.perimeter();
                            LOGGER.info(print);
                        } else {
                            LOGGER.info("please enter valid values");
                        }
                    }
                    case 2 -> {
                        LOGGER.info("Enter the Length:");
                        double length = input.nextDouble();
                        LOGGER.info("Enter the breadth:");
                        double breadth = input.nextDouble();
                        ReactAngle reactAngle = new ReactAngle(length, breadth);
                        String print = "Area of the ReactAngle:" + reactAngle.area() + "\nPerimeter of the Reactangle:" + reactAngle.perimeter();
                        LOGGER.info(print);
                    }
                    case 3 -> {
                        LOGGER.info("Enter the radius:");
                        double radius = input.nextDouble();
                        Circle circle = new Circle(radius);
                        String print = "Area of the Circle:" + circle.area() + "\nPerimeter of the Circle:" + circle.perimeter();
                        LOGGER.info(print);
                    }
                    default -> {
                        LOGGER.info("----Thank You----");
                        key = 1;
                    }
                }
                if (key == 1) {
                    break;
                }

            }
            catch (Exception e)
            {
                String value1 = "Please Enter Valid Inputs:" + e;
                LOGGER.info(value1);
                input.nextLine();
            }
        }

    }
}