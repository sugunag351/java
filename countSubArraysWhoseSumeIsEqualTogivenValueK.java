package programming12;

public class countSubArraysWhoseSumeIsEqualTogivenValueK
{
    static void subArraysCount(int[] ar,int size,int k)
    {
        int count=0;
        for(int i=0;i<=ar.length-size;i++)
        {
            int sum=0;
            for(int j=i;j<size+i;j++)
            {
                sum=sum+ar[j];
            }
            if(sum==k)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        int[] ar={5,1,2,4,9,3,1,3,3};
        int size=3;
        int k=7;
        subArraysCount(ar,size,k);
    }
}
