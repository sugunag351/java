package loops;

public class pattern3
{
    public static void main(String[] args)
    {
        for(int r=0;r<5;r++)
        {
            for(int c=1;c<=5-r;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
