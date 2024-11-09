package CodingNinjas_Arrays;

public class IntersectionOfTwoArrays
{
    static void Intersections(int[] ar1,int[] ar2)
    {
        for(int i=0;i<ar1.length;i++)
        {
            for(int j=0;j<ar2.length;j++)
            {
                if(ar1[i]==ar2[j])
                {
                    System.out.print(ar1[i]+" ");
                    ar2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar1={2,6,1,2};
        int[] ar2={1,2,3,4,2};
        Intersections(ar1,ar2);
    }
}