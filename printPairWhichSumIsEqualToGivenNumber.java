package programming10;

public class printPairWhichSumIsEqualToGivenNumber
{
    static void meth(int[] ar,int k)
    {
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]+ar[j] == k) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }
    public static void main(String []args)
    {
        int[] ar={3,2,4,1};
        int k=5;
        meth(ar,k);
    }
}
