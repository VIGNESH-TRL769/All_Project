package project.card;
import java.util.Scanner;
import java.util.logging.Logger;
public class Card
{
    public static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    private Card()
    {
        LOGGER.info("---Credit Card---");
    }

    public static void cardTask() {
        Scanner input = new Scanner(System.in);
        try {
            LOGGER.info("Enetr the HolderName:");
            String name = input.nextLine();
            LOGGER.info("Enetr the CardNumber:");
            long cardNumber = input.nextLong();
            LOGGER.info("Enetr the ExpirationDate:");
            String expirationDate = input.next();
            CreaditCard creaditCard = new CreaditCard(name, cardNumber, expirationDate);
            CreaditCard cloneCreaditCard = (CreaditCard)creaditCard.clone();
            LOGGER.info("Enetr the NewCardNumber:");
            long newCardNumber = input.nextLong();
            String checkNumber = String.valueOf(creaditCard.checkNumber(newCardNumber));
            if (checkNumber.equals("true"))
                LOGGER.info("Cardnumber is equal");
            else {
                LOGGER.info("Cardnumber is not equal");
                cloneCreaditCard.cardNumber = newCardNumber;
            }
            String oldcard = "Original Details:Holder Name:" + name + " Card Number:" + cardNumber + " Experied Date:" + expirationDate;
            String newCaed = "Cloned Details:Holder Name:" + cloneCreaditCard.name + " Card Number:" + cloneCreaditCard.cardNumber + " Experied Date:" + cloneCreaditCard.expirationDate;
            LOGGER.info(oldcard);
            LOGGER.info(newCaed);
        } catch (Exception e) {
            String value1 = "Please Enter Valid Inputs:" + e;
            LOGGER.info(value1);
            input.nextLine();
        }
    }
}