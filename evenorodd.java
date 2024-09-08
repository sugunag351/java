package methods;
import java.util.*;

public class evenorodd
{
    static void meth(int n)
    {
        if(n%2==0)
        {
            System.out.println(n+": is a even number");
        }
        else
        {
            System.out.println(n+": is a odd number");
        }
    }
    public static  void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        meth(n);
    }
}
