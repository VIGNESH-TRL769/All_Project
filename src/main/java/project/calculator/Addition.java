package project.calculator;

public class Addition extends Operation implements Icalculator
{
    public int calc(int value,int result)
    {
        return result+value;
    }
}
