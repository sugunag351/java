package CodingNinjas_Arrays;

public class printTriplets
{
    static void findTriplets(int[] ar,int sum)
    {
        for(int i=0;i<ar.length-2;i++)
        {
            for(int j=i+1;j<ar.length-1;j++)
            {
                for(int k=j+1;k<ar.length;k++)
                {
                    if(ar[i]+ar[j]+ar[k]==sum)
                    {
                        System.out.print("("+ar[i]+","+ar[j]+","+ar[k]+")");
                        System.out.println();
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={2,-5,8,-6,0,5,10,11,-3};
        int sum=10;
        findTriplets(ar,sum);
    }
}
