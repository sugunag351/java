package calculate_different_areas;

public class calculate_different_areas
{
    static double area(double l,double b)
    {
        return l*b;
    }
    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    static double area(double a,double b,double h)
    {
        return 0.5*(a+b)*h;
    }
    static int area(int b,int h)
    {
        return b*h;
    }
    public static void main(String args[])
    {
        System.out.println("area of rectangle is "+area(2.5,5.5));
        System.out.println("area of circle is "+area(3));
        System.out.println("area of trapezium is "+area(1,2,3));
        System.out.println("area of parallelogarm is "+area(10,5));
    }
}
