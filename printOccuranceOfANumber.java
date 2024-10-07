package programming8;

public class printOccuranceOfANumber
{
    public static void main(String[] args)
    {
        int[] ar = {2, 2, 3, 4, 4, 4, 7, 7};
        int count=1;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]==ar[i+1])
            {
                count++;
            }
            else
            {
                System.out.println(ar[i]+"-"+count);
                count=1;
            }
        }
        System.out.println(ar[ar.length-1]+"-"+count);
    }
}
