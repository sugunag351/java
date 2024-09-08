package methods;

import java.util.Scanner;

public class sumoftwonumbers
{
    static  int sum(int x,int y)
    {
       return x+y;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("sum of two numbers is:"+sum(a,b));

    }
}
