package programming4;

import java.util.Scanner;

public class printCommonFactorsOfTwoNumbers
{
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                System.out.println(i);
            }
        }

    }
}
