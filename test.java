package TeacherStudentsMultithreading;
class whiteboard
{
    String text;
    int count=0;
    int noofstudents=0;
    public void attendance()
    {
        noofstudents++;
    }
    synchronized public void write(String t)
    {
        System.out.println("teacher is writing:"+t);
        while(count!=0)
            try{wait();}catch(Exception e){}
        text=t;
        count=noofstudents;
        notifyAll();
    }
    synchronized public String read()
    {
        while(count==0)
            try{wait();}catch(Exception e){}
        String t=text;
        count--;
        if(count==0)
            notify();
        return t;
    }
}
class teacher extends Thread
{
    whiteboard wb;
    String notes[]={"1","2","3","end"};
    public teacher(whiteboard w)
    {
        wb=w;
    }
    public void run()
    {
        for(int i=0;i<notes.length;i++)
            wb.write(notes[i]);
    }
}
class student extends Thread{
    whiteboard wb;
    String name;
    public student(String n,whiteboard w)
    {
        name=n;
        wb=w;
    }
    public void run()
    {
        String text;
        wb.attendance();
        do {
             text=wb.read();
            System.out.println(name + "reading:  " +text);
        }while(!text.equals("end"));

    }
}
public class test {
    public static void main(String args[])
    {
        whiteboard wb=new whiteboard();
        teacher t=new teacher(wb);
        student s1=new student("a: ",wb);
        student s2=new student("b: ",wb);
        student s3=new student("c: ",wb);
        student s4=new student("f: ",wb);
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}
