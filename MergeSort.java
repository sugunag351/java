package CodingNinjas_Arrays2;

public class MergeSort
{
    static int[] mergeSort(int[] ar1,int[] ar2)
    {
        int[] ar3=new int[ar1.length+ar2.length];
        int i=0,j=0,k=0;
        while(i< ar1.length && j<ar2.length)
        {
            if(ar1[i]<ar2[j])
            {
                ar3[k++]=ar1[i++];
            }
            else
            {
                ar3[k++]=ar2[j++];
            }
        }
        while(i<ar1.length)
        {
            ar3[k++]=ar1[i++];
        }
        while(j<ar2.length)
        {
            ar3[k++]=ar2[j++];
        }
        return ar3;
    }
    public static void main(String[] args)
    {
        int[] ar1={1,4,6,10,13};
        int[] ar2={2,5,7,9};
        int[] ar3=mergeSort(ar1,ar2);
        for(int x:ar3)
        {
            System.out.print(x+" ");
        }
    }
}
