package project.card;
class CreaditCard implements Cloneable
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
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    protected Boolean checkNumber(long newCardNumber)
    {
        return cardNumber==newCardNumber;
    }
}
