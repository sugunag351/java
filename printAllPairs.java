package programming10;

public class printAllPairs
{
    static void meth(int[] ar)
    {
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                System.out.println(ar[i]+" "+ar[j]);
            }
        }
    }
    public static void main(String []args)
    {
        int[] ar={3,2,4,1};
        meth(ar);
    }
}
