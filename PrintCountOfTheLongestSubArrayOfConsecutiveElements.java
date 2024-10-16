package programming14;

public class PrintCountOfTheLongestSubArrayOfConsecutiveElements
{
    static void meth(int[] ar)
    {
        int count=1,max=0;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]+1 == ar[i+1])
            {
                count++;
            }
            else
            {
                if(count>max)
                {
                    max=count;
                }
                count=1;
            }
        }
        if(count>max)
        {
            max=count;
        }
        System.out.print(max);
    }
    public static void main(String[] args)
    {
        int[] ar={5,12,13,14,9,2,3,4,5,6};
        meth(ar);
    }
}
