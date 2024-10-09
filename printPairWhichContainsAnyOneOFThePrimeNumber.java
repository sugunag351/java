package programming10;

public class printPairWhichContainsAnyOneOFThePrimeNumber
{
    static boolean isprime(int n)
    {
        if(n==1)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    static void meth(int[] ar)
    {
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(isprime(ar[i]) || isprime(ar[j]))
                {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }
    public static void main(String []args)
    {
        int[] ar={3,2,4,1};
        meth(ar);
    }
}
