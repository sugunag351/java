package CodingNinjas_Arrays;

public class FindUniqueElementInArray
{
    static int findUnique(int[] ar)
    {
        int i,j;
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar.length;j++)
            {
                if(i!=j)
                {
                    if(ar[i]==ar[j])
                    {
                        break;
                    }
                }
            }
            if(j== ar.length)
            {
                return ar[i];
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] ar={2,3,1,6,3,6,2};
        System.out.println(findUnique(ar));
    }
}
