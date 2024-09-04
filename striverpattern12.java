package loops;

public class striverpattern12
{
    public static void main(String args[])
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=1;k<=((n*2)-(i*2));k++)
            {
                System.out.print(" ");
            }
            for(int m=i;m>=1;m--)
            {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
