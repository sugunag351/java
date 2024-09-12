package constructorspractice;
class a{}
class b extends a{}
class parent
        {
            public a display()
            {
                System.out.println("hello");
                return new a();
            }

        }
class child extends parent{
    public b display()
    {
        System.out.println("hi suguna");
        return new b();
    }

}
public class constructors
{
    public static void main(String args[])
    {
        child p1=new child();
        p1.display();



    }
}
