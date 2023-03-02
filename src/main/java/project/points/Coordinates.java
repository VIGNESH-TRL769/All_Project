package project.points;

public class Coordinates implements Cloneable
{
    int x;
    int y;
    Coordinates(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

