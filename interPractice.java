package interfacePractice;
interface test
{
    void meth1();
    void meth2();
     private void me()
    {
        System.out.println("me");
    }
     public default void meth()
    {
        me();
        System.out.println("meth");
    }
}
class my implements test{


    public void meth1(){System.out.println("meth1");}

    @Override
     public void meth2() {System.out.println("meth2");}
    public void me()
    {
        System.out.println("mei");
    }
}
public class interPractice
{
    public static void main(String args[])
    {
      test t=new my();
      t.meth();
    }
}
