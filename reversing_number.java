package reversing_number;

public class reversing_number
{
    static int reverse(int n)
    {
        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        System.out.println("reverse of a given number is "+reverse(6243));


    }
}
