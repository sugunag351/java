package loops;

public class pattern9
{
    public static void main(String args[])
    {
        int n=5;
        for(int r=1;r<=n;r++)
        {
            for(int s=2;s<=r;s++)
            {
                System.out.print(" ");
            }
            for(int c=0;c<=(n-r);c++)
            {
                System.out.print("*");
            }
            for(int k=0;k<(n-r);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
