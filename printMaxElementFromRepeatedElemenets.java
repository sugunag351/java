package programming9;

public class printMaxElementFromRepeatedElemenets
{
    static void meth1(int[] ar)
    {
        for(int i=ar.length-1;i>0;i--)
        {
            if(ar[i]==ar[i-1])
            {
                System.out.println(ar[i]);
                return;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={3,3,5,6,7,8,9,10,13};
        meth1(ar);

    }
}
