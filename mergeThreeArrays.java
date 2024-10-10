package programming11;

public class mergeThreeArrays
{
    static int[] meth(int[] ar1,int[] ar2,int[] ar3)
    {
        int[] res=new int[ar1.length+ar2.length+ar3.length];
        int i=0,k=0;
        while(k<res.length)
        {
            if(i<ar1.length)
            {
                res[k++]=ar1[i];
            }
            if(i<ar2.length)
            {
                res[k++]=ar2[i];
            }
            if(i<ar3.length)
            {
                res[k++]=ar3[i];
            }
            i++;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] ar1={2,3,4};
        int[] ar2={5,6,7,8};
        int[] ar3={9,10,11,12,13};
        int[] result=meth(ar1,ar2,ar3);
        for(int x:result)
        {
            System.out.print(x+" ");
        }
    }
}
