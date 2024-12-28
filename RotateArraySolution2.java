package CodingNinjas_Arrays2_Assignment;

public class RotateArraySolution2
{
    static void meth(int[] ar)
    {
        int d=3;//number of rotations
        int temp;
        while(d>0)
        {
            temp=ar[0];
            int i;
            for(i=0;i<ar.length-1;i++)
            {
                ar[i]=ar[i+1];
            }
            ar[i]=temp;
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
