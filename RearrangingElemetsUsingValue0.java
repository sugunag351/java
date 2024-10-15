package programming14;

public class RearrangingElemetsUsingValue0
{
    static void meth(int[] ar)
    {
        int i,j;
        for(i=ar.length-1;i>=0;i--)
        {
            if(ar[i]==0)
            {
                j=i;
                while(j!=ar.length-1 && ar[j+1]!=0)
                {
                    ar[j]=ar[j+1];
                    ar[j+1]=0;
                    j++;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={3,7,0,4,0,6,0,8,0,3};
        meth(ar);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
