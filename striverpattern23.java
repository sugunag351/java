package loops;

public class striverpattern23
{
    public static void main(String[] args)
    {
        int n=4;
        int x=2*n-2;
        for(int i=0;i<=x;i++)
        {
            for(int j=0;j<=x;j++)
            {
                int atEveryIndex=Math.min(Math.min(i,j),Math.min(x-i,x-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
