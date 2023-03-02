package project.main;
import java.util.Scanner;
import java.util.logging.Logger;
import  project.bank.Bank;
import  project.calculator.Calculator;
import  project.card.Card;
import  project.collections.Collections;
import  project.contacts.Contacts;
import  project.database.DatabaseConnection;
import  project.fileread.Fileread;
import  project.hashing.Hashing;
import  project.points.Points;
import  project.shapes.Shapes;
import  project.studentgrade.Studentgrade;
import  project.studenttest.StudentTest;
import  project.tictactoe.Tictactoe;
public class Main
{
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void main(String[] args)  {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                try {
                    LOGGER.info("\n1.Bank\n2.Calculator\n3.CreditCard\n4.Collection\n5.Contacts\n6.DataBase\n7.Fileread\n8.Hashing\n9.Points\n10.Shapes\n11.StudentGrade\n12.StudentTest\n13.TicTacToe\n14.Exit\nEnter Choice:");
                    int key = input.nextInt();
                    switch (key) {
                        case 1 -> Bank.bankTask();
                        case 2 -> Calculator.calculatorTask();
                        case 3 -> Card.cardTask();
                        case 4 -> Collections.collectionsTask();
                        case 5 -> Contacts.contactsTask();
                        case 6 -> DatabaseConnection.databaseConnectionTask();
                        case 7 -> {
                            try{Fileread.filereadTask();}
                            catch (InterruptedException e)
                            {
                                String value1 = "Please Enter Valid Inputs:" + e;
                                LOGGER.info(value1);
                                input.nextLine();
                            }
                        }
                        case 8 -> Hashing.hashingTask();
                        case 9 -> Points.pointsTask();
                        case 10 -> Shapes.shapesTask();
                        case 11 -> Studentgrade.studentgrade();
                        case 12 -> StudentTest.studentTestTask();
                        case 13 -> Tictactoe.tictactoeTask();
                        case 14 -> {
                            LOGGER.info("-----Thank You-----");
                            return;
                        }
                        default -> throw new IllegalStateException("Unexpected value: " + key);
                    }
                } catch (Exception e) {
                    String value1 = "Please Enter Valid Inputs:" + e;
                    LOGGER.info(value1);
                    input.nextLine();
                }

            }
        }

    }
}
