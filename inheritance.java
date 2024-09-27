package inheritanceExample;
class circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}
class cylinder extends circle
{
    public double height;
    public double volume()
    {
        return area()*height;
    }
}
public class inheritance
{
    public static void main(String args[])
    {
        cylinder c=new cylinder();
        c.radius=10;
        c.height=5;
        System.out.println("volume:"+c.volume());
        System.out.println("area:"+c.area());
    }
}
