package methods;
import java.util.*;

public class voting
{
    static void age(int a)
    {
        if(a>=18)
        {
            System.out.println("eligible for voting");
        }
        else
        {
            System.out.println("not eligible for voting");
        }
    }
    public  static  void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        age(n);


    }
}
