package loops;

public class pattern7
{
    public static void main(String args[])
    {
        int n=5;
        for(int r=0;r<n;r++)
        {
            for(int k=0;k<r;k++)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=(n-r);c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
