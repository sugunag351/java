package programming12;

public class printCommonElementsInTwoArrays
{
    static void meth(int[] ar1,int[] ar2)
    {
       int i=0,j=0;
       while(i<ar1.length && j<ar2.length)
       if(ar2[j]<ar1[i])
       {
           j++;
       }
       else if(ar1[i]==ar2[j])
       {
           System.out.println(ar1[i]);
           i++;
           j++;
       }
       else
       {
           i++;
       }
    }
    public static void main(String[] args)
    {
        int[] ar1={3,5,6,8,9};
        int[] ar2={2,3,4,6,7,8,8};
        meth(ar1,ar2);
    }
}
