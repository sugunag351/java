package programming9;

public class printMaxElementFromUniqueElements {
    static void meth1(int[] ar)
    {
        int count = 1;
        int i;
        for ( i = ar.length-1; i >=1; i--)
        {
            if (ar[i] == ar[i - 1])
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
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {
        int[] ar = {2, 3, 4, 5,5,6,6,8};
        meth1(ar);
    }
}
