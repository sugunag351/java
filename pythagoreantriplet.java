package methods;

import java.util.Scanner;

public class pythagoreantriplet
{
    static void meth(int x,int y,int z)
    {
        if( (x*x + y*y == z*z) || (x*x + z*z ==y*y) || (y*y + z*z ==x*x))
        {
          System.out.println("pythagorean triplets");
        }
        else
        {
            System.out.println("not a pythagorean triplets");
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        meth(x,y,z);
    }
}
