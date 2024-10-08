package programming9;

public class printMaxNumberFromTheUniqueElements
{
    public static void main(String[] args)
    {
        int[] ar={3,5,5,7,7,8,10,10};
        int i;
        int max=Integer.MIN_VALUE;
        for(i=0;i<ar.length-1;i++)
        {
            if(i==0 && ar[i]!=ar[i+1])
            {
                if(ar[i]>max)
                {
                    max=ar[i];
                }
            }
            else if(i!=0 && ar[i]!=ar[i-1] && ar[i]!=ar[i+1])
            {
                if(ar[i]>max)
                {
                    max=ar[i];
                }
            }
        }
        if(ar[i]!=ar[i-1]) {
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        System.out.println(max);
    }
}
