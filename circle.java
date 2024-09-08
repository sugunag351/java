package methods;

import java.util.Scanner;

public class circle
{
    static double area(int r)
    {
        return 3.14*r*r;
    }
    static double circumference(int r)
    {
        return 2*3.14*r;
    }
    public  static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int radius=s.nextInt();
        System.out.println("area of circle is:"+area(radius));
        System.out.println("circumference of circle is:"+circumference(radius));
    }
}
