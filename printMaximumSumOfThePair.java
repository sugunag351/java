package programming8;

public class printMaximumSumOfThePair
{
    static int secondMaxNumber(int[] ar)
    {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i=0;i< ar.length;i++)
        {
            if(ar[i]>max1)
            {
                max2=max1;
                max1=ar[i];
            }
            else if(ar[i]>max2 && ar[i]!=max1)
            {
                max2=ar[i];
            }
        }
        return max1+max2;

    }
    public static void main(String[] args)
    {
        int[] ar={2,4,3,3,4};
        int result=secondMaxNumber(ar);
        System.out.println(result);
    }
}
