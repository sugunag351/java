package programming15;

public class PrintLongestIncreasingCosecutiveSubArray
{
    static void meth(int[] ar)
    {
        int count=1,max=0,index=0,i;
        for(i=0;i<ar.length-1;i++)
        {
            if(ar[i]+1 == ar[i+1])
            {
                count++;
            }
            else
            {
                if(count>max)
                {
                    max=count;
                    index=i;
                }
                count=1;
            }
        }
        if(count>max)
        {
            max=count;
            index=i;
        }
        System.out.println("index:"+index+"  max:"+max+" ");
       for(int j=index-(max-1);j<=index;j++)
        {
            System.out.print(ar[j]+" ");
        }

    }
    public static void main(String[] args)
    {
        int[] ar={5,12,13,14,9,2,3,4,5,8};
        meth(ar);

    }
}
