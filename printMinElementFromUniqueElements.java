package programming9;

public class printMinElementFromUniqueElements
{
    static void meth1(int[] ar)
    {
        int count = 1;
        for (int i = 0; i < ar.length - 1; i++)
        {
            if (ar[i] == ar[i + 1])
            {
                count++;
            }
            else
            {
                if (count == 1)
                {
                    System.out.println(ar[i]);
                    return;
                }
                count = 1;
            }
        }
        if (count == 1)
        {
            System.out.println(ar[ar.length - 1]);
        }
    }
    public static void main(String[] args) {
        int[] ar = {2, 2, 3, 4, 5,5,6,6,8};
        meth1(ar);
    }
}
