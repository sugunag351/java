package loops;

public class pattern5
{
    public static void main(String args[])
    {
        int n=5;
        for(int r=1;r<2*n;r++)
        {
            int totalcolumnsinarow = r>n ? 2*n-r : r;
            for(int c=1;c<=totalcolumnsinarow;c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
