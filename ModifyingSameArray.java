package programming13;

public class ModifyingSameArray
{
    static void meth(int[] ar)
    {
        int i,j;
        for(i=0;i<ar.length;i++)
        {
            if(ar[i]==-1)
            {
                j=i;
                while(j!=0 && ar[j-1]!=-1)
                {
                    ar[j]=ar[j-1];
                    ar[j-1]=-1;
                    j--;
                }
            }
        }
        for(int x:ar)
        {
            System.out.print(x+" ");

        }
    }
    public static void main(String[] args)
    {
        int[] ar={-1,2,-1,3,4,5,3,-1,8,-1,7};
        meth(ar);
    }
}
