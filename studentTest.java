package student;
class student
{
   String name;
   int marks;
}
public class studentTest
{
    public static void main(String args[])
    {
        student s1=new student();
        s1.name="suguna";
        s1.marks=50;
        student s2=new student();
        s2.name="soujanya";
        s2.marks=100;
        student s3=new student();
        s3.name="anusha";
        s3.marks=97;
        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name+":"+students[i].marks);
        }

    }
}
