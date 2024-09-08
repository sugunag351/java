package methods;

import java.util.Scanner;

public class factorial
{
    static int Factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.println(x+"! is:"+Factorial(x));

    }
}
