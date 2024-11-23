package CodingNinjas_Arrays2_Assignment;

public class RotateArraySolution1
{
    static void meth(int[] ar)
    {
        int d=2;//number of rotations
        int temp;
        while(d>0)
        {
            for(int i=1;i<ar.length;i++)
            {
                temp=ar[i];
                ar[i]=ar[i-1];
                ar[i-1]=temp;
            }
            d--;
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
