package programming8;

import java.awt.*;

public class printUniqueElementsFromArray
{
    public static void main(String[] args)
    {
        int[] ar={3,5,5,6,7,7,9,9,10};
        int i;
        for(i=0;i<ar.length-1;i++)
        {
            if(i==0 && ar[i]!=ar[i+1])
            {
                System.out.println(ar[i]);
            }
            else if(i!=0 && ar[i]!=ar[i-1] && ar[i]!=ar[i+1])
            {
                System.out.println(ar[i]);
            }
        }
        if(ar[i]!=ar[i-1]) {
            System.out.println(ar[i]);
        }
    }
}
