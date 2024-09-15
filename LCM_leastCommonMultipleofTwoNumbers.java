package programming4;

import java.util.Scanner;

public class LCM_leastCommonMultipleofTwoNumbers
{
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int lcm=n1>n2 ? n1 : n2;
        while(true)
        {
            if(lcm%n1==0 && lcm%n2==0)
                break;
            lcm++;
        }
        System.out.println(lcm);

    }
}
