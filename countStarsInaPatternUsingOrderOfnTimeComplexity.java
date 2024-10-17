package programming15;

public class countStarsInaPatternUsingOrderOfnTimeComplexity
{
    public static void main(String[] args)
    {
        int n=4;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            count=count+i;
        }
        System.out.println(count);
    }
}
