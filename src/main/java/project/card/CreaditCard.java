package project.card;
class CreaditCard
{
    String name;
    long cardNumber;
    String expirationDate;
    CreaditCard(String name,long cardNumber,String expirationDate)
    {
        this.name=name;
        this.cardNumber=cardNumber;
        this.expirationDate=expirationDate;
    }
    protected CreaditCard(CreaditCard object)
    {
        name=object.name;
        cardNumber=object.cardNumber;
        expirationDate= object.expirationDate;
    }
    protected Boolean checkNumber(long newCardNumber)
    {
        return cardNumber==newCardNumber;
    }
}
