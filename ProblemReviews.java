package Arrays;
import java.util.*;
public class ProblemReviews
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int n=s.nextInt();
            boolean num=false;
            for(int i=0;i<n;i++)
            {
                int x=s.nextInt();
                if(x<=4)
                {
                    num=true;
                }
            }
            if(num)
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
            }
            t--;
        }
    }
}
