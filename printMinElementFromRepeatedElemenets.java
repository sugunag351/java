package programming9;

public class printMinElementFromRepeatedElemenets
{
    static void meth1(int[] ar)
    {
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]==ar[i+1])
            {
                System.out.println(ar[i]);
                return;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={3,5,6,7,7,7,8,9,9,13};
        meth1(ar);

    }
}
