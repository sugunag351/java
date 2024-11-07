package CodingNinjas_Arrays;

public class FindDuplicateElement
{
    static int findDuplicate(int[] ar)
    {
        int i,j;
        for(i=0;i<ar.length-1;i++)
        {
            for(j=i+1;j<ar.length;j++)
            {
                    if(ar[i]==ar[j])
                    {
                        return ar[i];
                    }
            }

        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] ar={0,2,1,3,1};
        System.out.println(findDuplicate(ar));
    }
}
