package CodingNinjas_Arrays;

public class printSumPairs
{
    static void sumPairs(int[] ar,int k)
    {
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]+ar[j]==k)
                {
                    if(ar[i]<ar[j]) {
                        System.out.print(ar[i] + " " + ar[j]);
                        System.out.println();
                    }
                    else
                    {
                        System.out.print(ar[j] + " " + ar[i]);
                        System.out.println();
                    }

                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={1,3,6,2,5,4,3,2,4};
        int k=7;
        sumPairs(ar,k);
    }
}
