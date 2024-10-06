package programming7;

public class First_N_multiplesOf_a_And_b
{
    public static void main(String[] args)
    {
        int n=5;
        int a=3,b=4;
        int count=0;
        for(int i=1;count<n;i++)
        {
            if(i%3==0 && i%4==0)
            {
                System.out.print(i+" ");
                count++;
            }
        }
    }
}
