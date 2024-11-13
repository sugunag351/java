package CodingNinjas_Arrays;

public class sortZeroAndOne
{
    static void meth(int[] ar)
    {
        for(int i=1;i<ar.length;i++)
        {
            int j=i;
            while(j!=0 && ar[j]==0 && ar[j-1]==1)
            {
                ar[j]=1;
                ar[j-1]=0;
                j--;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={0,1,1,0,1,0,1};
        meth(ar);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
