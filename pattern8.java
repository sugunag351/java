package loops;

public class pattern8
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
                System.out.print("*");
            }
            for(int k=2;k<=r;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
