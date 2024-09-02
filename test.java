package abstractClassPractice;
abstract class shape
{
   abstract double perimeter();
   abstract double  area();
}
class circle extends shape{
    double radius;
    circle()
    {
        radius=1;
    }
    circle(int r)
    {
        radius=r;
    }
    double  perimeter()
    {
        return 2*Math.PI*radius;
    }
    double area()
    {
        return Math.PI*radius*radius;
    }
}
class rectangle extends shape{
    double length;
    double breadth;
    rectangle()
    {
        length=1;
        breadth=1;
    }
    rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    double perimeter()
    {
        return 2*(length+breadth);
    }
    double area()
    {
        return length*breadth;
    }
}
public class test
{
    public static void main(String args[])
    {
       shape c=new circle();
       System.out.println(c.perimeter());
       System.out.println(c.area());

       shape c1=new circle(10);
       System.out.println(c1.perimeter());
       System.out.println(c1.area());

        shape r=new rectangle();
        System.out.println(r.perimeter());
        System.out.println(r.area());

        shape r1=new rectangle(10,20);
        System.out.println(r1.perimeter());
        System.out.println(r1.area());
    }
}
