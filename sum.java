package methods;

import java.util.Scanner;

public class sum
{
    static int meth(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("sum of first n natural numbers is:"+meth(n));
    }
}
