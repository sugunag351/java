package programming12;

public class printSumOfAllSubArraysOfGivenSize
{
    static void subArraysSum(int[] ar,int size)
    {

        for(int i=0;i<=ar.length-size;i++)
        {
            int sum=0;
            for(int j=i;j<size+i;j++)
            {
                sum=sum+ar[j];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args)
    {
        int[] ar={5,1,2,4,9,3,1,3,3};
        int size=3;
        subArraysSum(ar,size);
    }
}
