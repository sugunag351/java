package programming1;

import java.util.Scanner;

public class chackGivenNumberIsEndingWith_75_or_not
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%100==75)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
