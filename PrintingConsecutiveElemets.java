package programming14;

public class PrintingConsecutiveElemets
{
    static void meth(int[] ar)
    {
        int i;
        for(i=0;i<ar.length-1;i++)
        {
            if(ar[i]+1 == ar[i+1])
            {
                System.out.print(ar[i]+" ");
            }
            else
            {
                System.out.print(ar[i]);
                System.out.println();
            }
        }
        System.out.print(ar[i]);
    }
    public static void main(String[] args)
    {
        int[] ar={5,12,13,14,9,2,3,4,5,8};
        meth(ar);
    }
}
