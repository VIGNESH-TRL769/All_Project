package project.hashing;

public class IdCard
{
    int rollno;
    String name;
    String department;
    String year;
    long phonenumber;
    String bloodGroup;
    IdCard(int rollno,String name,String department,String year,long phonenumber,String bloodGroup)
    {
        this.rollno=rollno;
        this.name=name;
        this.department=department;
        this.year=year;
        this.phonenumber=phonenumber;
        this.bloodGroup=bloodGroup;
    }
    public String toString()
    {
        return this.rollno+" "+this.name+" "+this.year+" "+this.department+" "+this.phonenumber+" "+this.bloodGroup;
    }
}