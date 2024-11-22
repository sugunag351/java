package CodingNinjas_Arrays2_Assignment;

public class pushZeroestoEndSolution2
{
    static void meth(int[] ar)
    {
        int k=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]!=0)
            {
                if(i==k)
                {
                }
                else
                {
                    ar[k]=ar[i];
                    ar[i]=0;
                }
                k++;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={0,2,0,0,1,3,0,0,5};
        meth(ar);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
