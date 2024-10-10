package programming11;

public class mergeArrays
{
    static int[] meth(int[] ar1,int[] ar2)
    {
        int[] res=new int[ar1.length+ar2.length];
        int i=0,j=0,k=0;
        while(i<ar1.length && j<ar2.length)
        {
            if(ar1[i]<=ar2[j])
            {
                res[k++]=ar1[i++];
            }
            else
            {
                res[k++]=ar2[j++];
            }
        }
        while(i<ar1.length)
        {
            res[k++]=ar1[i++];
        }
        while(j<ar2.length)
        {
            res[k++]=ar2[j++];
        }

        return res;

    }
    public static void main(String[] args)
    {
        int[] ar1={3,5,7,9,13};
        int[] ar2={1,2,3,4,9,15,17,19};
       int[] result=meth(ar1,ar2);
       for(int x:result)
       {
           System.out.print(x+" ");
       }
    }
}
