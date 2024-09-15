package programming4;

import java.util.Scanner;

public class printPrimeNumbersTillTheGivenNumber
{
    static boolean isprime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for(int i=2;count<n;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
                count++;
            }
        }


    }
}
