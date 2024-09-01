package loops;

public class pattern18
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j1=1;j1<=n-i+1;j1++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(i-1);k++)
            {
                System.out.print(" ");
            }
            for(int j2=1;j2<=n-i+1;j2++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int m=n;
        for(int i=m;i>=1;i--)
        {
            for(int j1=1;j1<=m-i+1;j1++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(i-1);k++)
            {
                System.out.print(" ");
            }
            for(int j2=1;j2<=m-i+1;j2++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
