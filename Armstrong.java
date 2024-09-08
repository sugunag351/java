package methods;

import java.util.Scanner;

public class Armstrong
{
    static void meth(int n)
    {
        int num=n;
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(num==sum)
        {
            System.out.println(num+": is a Armstrong");
        }
        else
        {
            System.out.println(num+": is not a Armstrong");
        }

    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        meth(n);
    }
}
