package recursion;

public class recursion
{
    static void fun(int n)
    {
        if(n>0)
        {
            fun(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String args[])
    {
        fun(3);
    }
}
