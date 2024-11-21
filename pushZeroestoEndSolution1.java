package CodingNinjas_Arrays2_Assignment;

public class pushZeroestoEndSolution1
{
    static void meth(int[] ar)
    {
        for(int i=1;i<ar.length;i++)
        {
            int j=i;
            while(j>0 && ar[j]!=0 && ar[j-1]==0)
            {
                ar[j-1]=ar[j];
                ar[j]=0;
                j--;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={2,0,0,1,3,0,0};
        meth(ar);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
