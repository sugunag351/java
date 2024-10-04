package LambdaExpressions;
interface mylambda
{
    public void  display();
}
class uselambda
{
    public void calllambda(mylambda ml)
    {
        ml.display();
    }
}
class demo
{
    public void method1()
    {
       uselambda ul=new uselambda();
       ul.calllambda(()->{System.out.println("hello");});
    }

}
public class test
{
    public static void main(String args[])
    {
       demo d=new demo();
       d.method1();
    }
}
