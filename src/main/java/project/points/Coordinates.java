package project.points;

public class Coordinates
{
    int x;
    int y;
    Coordinates(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    Coordinates(Coordinates object)
    {
        x=object.x;
        y=object.y;
    }
}

