package loops;

public class pattern10
{
    public static void main(String args[])
    {
        int n=5;
        for(int r=1;r<=n;r++)
        {
            int a=n-r;
            while(a>0)
            {
                System.out.print(" ");
                a--;
            }
            for(int c=1;c<=r;c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
