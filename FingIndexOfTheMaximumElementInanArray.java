package programming6;

import java.util.Scanner;

public class FingIndexOfTheMaximumElementInanArray
{
    static int maximum(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int maxindex=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                maxindex=i;

            }
        }
        return maxindex;
    }
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(maximum(arr));

    }
}
