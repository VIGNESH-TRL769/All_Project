package project.shapes;
public class ReactAngle implements Ishape
{
    private final double length;
    private final double breadth;
    ReactAngle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public double perimeter()
    {

        return 2 * (length + breadth);
    }

    public double area()
    {
        return length * breadth;
    }


}