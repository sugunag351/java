package tcs;
import java.util.Scanner;
public class tcs
{
    public static void main(String args[])
    {
                Scanner s=new Scanner(System.in);
                int a=s.nextInt();
                System.out.print(" ");
                int b=s.nextInt();
                a=a^b;
                b=a^b;
                a=a^b;
                System.out.println(a+" "+b);
                s.close();



    }
}
