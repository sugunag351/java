package programming9;

import java.awt.*;

public class printSpecialCharactersbetweenEveryNumbers
{
    static void meth(int[] ar)
    {
        System.out.print(ar[0]);
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]%2==0 && ar[i+1]%2==0)
            {
                System.out.print("#"+ar[i+1]);
            }
            else if(ar[i]%2!=0 && ar[i+1]%2!=0)
            {
                System.out.print("*"+ar[i+1]);
            }
            else
            {
                System.out.print("$"+ar[i+1]);
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={7,3,2,4,9,5};
        meth(ar);
    }
}
