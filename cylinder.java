package cylinder;

class cylinders
{
    public double radius;
    public double height;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double volume()
    {
        return area()*height;
    }
    public double totalsurfacearea()
    {
        return 2*area()+circumference()*height;

    }
    public double circumference()

    {
        return 2*Math.PI*radius;
    }


    public static void main(String args[]) {
        cylinders c = new cylinders();
        c.radius = 7;
        c.height = 14;
        System.out.printf("area:%6.2f",c.area());
        System.out.println();System.out.printf("volume:%6.2f",c.volume());
        System.out.println();
        System.out.printf("circumference:%6.2f",c.circumference());
        System.out.println();
        System.out.printf("totalsurfacearea:%6.2f",c.totalsurfacearea());

    }
}