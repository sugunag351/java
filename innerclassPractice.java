package innerclassPractice;
class outer
{
    int x=10;
    static int y=20;
    static class inner
    {
        void display()
        {
            System.out.println(y);
        }
    }
}
public class innerclassPractice {
    public static void main(String args[])
    {
        new outer.inner().display();
    }
}
