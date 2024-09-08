package methods;

import java.util.Scanner;

public class palindrome
{
    static void meth(int n)
    {
        int num=n;
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(num==rev)
        {
            System.out.println(num+": is a palindrome");
        }
        else
        {
            System.out.println(num+": is not a palindrome");
        }

    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        meth(n);
    }
}
