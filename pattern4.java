package loops;

public class pattern4
{
    public static void main(String[] args)
    {
        for(int r=1;r<=5;r++)
        {
            for(int c=1;c<=r;c++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
