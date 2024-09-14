package programming2;

import java.util.Scanner;

public class FactorsOfaGivenNumber
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print("factors of "+n+" are:");
        for (int i = 1; i <= n; i++)
        {
           if(n%i==0)
           {
               System.out.print(i+" ");
           }
        }
    }
}
