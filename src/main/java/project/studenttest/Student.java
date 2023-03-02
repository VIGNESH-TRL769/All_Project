package project.studenttest;

public class Student
{
    private final String name;
    private final int age;
    private final float gpa;
    Student(String name,int age,float gpa)
    {
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }
    protected String getName()
    {
        return name;
    }
    protected int getAge()
    {
        return age;
    }
    protected float getGpa()
    {
        return gpa;
    }
}
