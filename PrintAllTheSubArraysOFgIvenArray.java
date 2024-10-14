package programming13;

public class PrintAllTheSubArraysOFgIvenArray
{
    static void meth(int[] ar)
    {
        int size=1;
        while(size <= ar.length)
        {
            for (int i = 0; i <= ar.length - size; i++)
            {
                for (int j = i; j < size + i; j++)
                {
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
            }
            size++;
        }
    }
    public static void main(String[] args)
    {
        int[] ar={1,3,5,4,8};
        meth(ar);
    }
}
