package programming14;

public class countSubArraysOfConsecutiveElements
{
    static void meth(int[] ar)
    {
        int count=1;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]+1 == ar[i+1])
            {
                count++;
            }
            else
            {
                System.out.println(count);
                count=1;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args)
    {
        int[] ar={5,12,13,14,9,2,3,4,5,6};
        meth(ar);
    }
}
