package CodingNinjas_Arrays2_Assignment;

public class SecondLargestInAnArray
{
    static int secondLargest(int[] ar)
    {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++)
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
        return max2;
    }
    public static void main(String[] args)
    {
        int[] ar={2,13,4,1,3,6,28,13};
        System.out.println(secondLargest(ar));
    }
}
