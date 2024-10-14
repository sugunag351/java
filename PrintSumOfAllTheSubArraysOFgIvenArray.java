package programming13;

public class PrintSumOfAllTheSubArraysOFgIvenArray
{
    static void meth(int[] ar)
    {
        int size=1;
        while(size <= ar.length)
        {
            for (int i = 0; i <= ar.length - size; i++)
            {
                int sum=0;
                for (int j = i; j < size + i; j++)
                {
                    sum=sum+ar[j];
                }
                System.out.println(sum);
            }
            size++;
        }
    }
    public static void main(String[] args)
    {
        int[] ar={1,3,5,4,8};
        meth(ar);
    }
}
