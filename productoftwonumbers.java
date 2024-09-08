package methods;

import java.util.Scanner;

public class productoftwonumbers
{
    static  int product(int x,int y)
    {
        return x*y;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("product of two numbers is:"+product(a,b));

    }
}
