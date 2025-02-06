package studentTest;
class student
{
    public int m1,m2,m3,avg;
    public String name,course,rollno;
    public int total()
    {
        return m1+m2+m3;
    }
    public void average()
    {
        avg=total()/3;
        System.out.println("average marks:"+avg);
    }
    public void grade()
    {
        if(avg>=60)
        {
            System.out.println("grade is A:");
        }
        else
        {
            System.out.println("grade is B:");
        }
    }
    public String toString()
    {
        return "\n"+"rollno:"+rollno+"\n"+"name:"+name+"\n"+"course:"+course+"\n";
    }
}
public class studentTest
{
    public static void main(String args[])
    {

    }
}
