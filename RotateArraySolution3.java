package CodingNinjas_Arrays2_Assignment;

public class RotateArraySolution3
{
    static void meth(int[] ar)
    {
        int d=3;//number of rotations
        int[] ar1=new int[d];
        for(int i=0;i<ar1.length;i++)
        {
            ar1[i]=ar[i];
        }
        for(int i=0;i<ar.length-d;i++)
        {
            ar[i]=ar[i+d];
        }
        for(int i=ar.length-d,j=0;i<ar.length&&j<d;i++,j++)
        {
            ar[i]=ar1[j];
        }
    }
    public static void main(String[] args)
    {
        int[] ar={2,6,3,1,5,9,8};
        meth(ar);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
