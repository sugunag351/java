package methods;

import java.util.Scanner;

public class primenumbersbetweentwonumbers
{
    static boolean isprime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        System.out.print("prime numbers between "+n+" and "+m+" is: ");
        for(int i=n;i<=m;i++)
        {
            if(isprime(i))
            {
               System.out.print(i+" ");
            }
        }

    }
}
