package programming15;

public class countStarsInaPatternUsingOrderOfnSquareTimeComplexity
{
    public static void main(String[] args)
    {
        int n=3;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
