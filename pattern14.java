package loops;

public class pattern14
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++)
            {
                if(k==0 || k==2*i || i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
