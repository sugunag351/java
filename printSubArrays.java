package programming12;

public class printSubArrays
{
    static void meth(int[] ar,int size)
    {
        for(int i=0;i<=ar.length-size;i++)
        {
            for(int j=i;j<size+i;j++)
            {
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[] ar={5,1,2,4,9,3,1,3,3};
        int size=3;
        meth(ar,size);
    }
}
