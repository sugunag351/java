package programming1;

import java.util.Scanner;

public class checkGivenNumberIsEndingwith7_or_Not
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%10==7)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
