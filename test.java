package serialization;
import java.io.*;
class student implements Serializable
{
   private int rollno;
   private String name;
   private float avg;
    private String dept;
    public static int data=10;
    public transient int t;
    public student()
    {

    }
    public student(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        dept=d;
        avg=a;
        data=500;
        t=500;
    }
    public String toString()
    {
        return "student details:"+
                "\nroll:"+rollno+
                "\nNmae:"+name+
                "\nAverage:"+avg+
                "\nDept:"+dept+
                "\nData:"+data+
                "\nTransient:"+t+"\n";
    }
}
public class test
{
    public static void main(String args[])throws Exception
    {
       FileInputStream fos=new FileInputStream("c:/users/dell/myjava/his.txt");
       ObjectInputStream oos=new ObjectInputStream(fos);
       student s=(student)oos.readObject();
       System.out.println(s);
    }
}
