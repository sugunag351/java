package programming8;

public class secondSmallestNumber
{
    static int secondMinNumber(int[] ar)
    {
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=0;i< ar.length;i++)
        {
            if(ar[i]<min1)
            {
                min2=min1;
                min1=ar[i];
            }
            else if(ar[i]<min2 && ar[i]!=min1)
            {
                min2=ar[i];
            }
        }
        return min2;
    }
    public static void main(String[] args)
    {
        int[] ar={3,5,4,6,7,8,10,9};
        int result=secondMinNumber(ar);
        System.out.println(result);
    }
}
