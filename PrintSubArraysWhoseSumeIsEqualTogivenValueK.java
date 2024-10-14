package programming13;

public class PrintSubArraysWhoseSumeIsEqualTogivenValueK
{
    static void subArraysCount(int[] ar,int size,int k)
    {
        int i,j;
        for(i=0;i<=ar.length-size;i++)
        {
            int sum=0;
            for(j=i;j<size+i;j++)
            {
                sum=sum+ar[j];
            }
            if(sum==k)
            {

                for(j=i;j<size+i;j++)
                {
                    System.out.print(ar[j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={5,1,2,4,9,3,1,3,3};
        int size=3;
        int k=7;
        subArraysCount(ar,size,k);
    }
}
