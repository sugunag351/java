package programming1;

import java.util.Scanner;

public class checkGivenNumberIsMultiple_or_Divisibleby_5_or_not
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%5==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }


    }
}
