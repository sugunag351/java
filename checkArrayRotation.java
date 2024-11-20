package CodingNinjas_Arrays2_Assignment;

public class checkArrayRotation
{
    static int meth(int[] ar)
    {
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]>ar[i+1])
            {
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int[] ar={5,6,1,2,3,4};
        System.out.println(meth(ar));
    }
}
