package programming13;

public class PrintOnlyOneLongestSubArrayWhoseSumeIsEqualTogivenValueK
{
    static void meth(int[] ar,int k)
    {
        int size=ar.length;
        while(size > 0)
        {
            for (int i = 0; i <= ar.length - size; i++)
            {
                int sum=0;
                for (int j = i; j < size + i; j++)
                {
                    sum=sum+ar[j];
                }
                if(sum==k)
                {
                    for (int j = i; j < size + i; j++)
                    {
                        System.out.print(ar[j]+" ");
                    }
                    return;
                }
            }
            size--;
        }
    }
    public static void main(String[] args)
    {
        int[] ar={3,5,1,2,0,1,2,1,2,3,5};
        int k=6;
        meth(ar,k);
    }
}
