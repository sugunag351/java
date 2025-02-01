package square;
class rectangle
        {
            private double length;
            private double breadth;
            public rectangle(double l,double b)
            {
                length=l;
                breadth=b;
            }
    public double area()
    {
        return length*breadth;
    }

}
public class square
{
    public static void main(String args[])
    {
        rectangle r=new rectangle(10,5);
        System.out.println("area:"+r.area());
    }

}
