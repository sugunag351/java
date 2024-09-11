package circle;
class my {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
        public double circumference()
        {
            return perimeter();
        }

    }
    public class circle
    {
        public static void main(String args[])
        {
            my t1=new my();
            my t2=new my();
            t1.radius=7;
            t2.radius=14;
            System.out.println("area:"+t1.area());
            System.out.println("perimeter:"+t1.perimeter());
            System.out.println("circumference:"+t1.circumference());

            System.out.println("area:"+t2.area());
            System.out.println("perimeter"+t2.perimeter());
            System.out.println("circumferenece:"+t2.circumference());

        }

    }


