package programming6;

import java.util.Scanner;

public class permutations
{
    static int max(int[] ar)
    {
        int max=Integer.MIN_VALUE;
       for(int i=0;i<ar.length;i++)
       {
           if(ar[i]>max)
           {
               max=ar[i];
           }
       }
       return max;
    }
    static int min(int[] ar)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
            {
                min=ar[i];
            }
        }
        return min;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int value1=min(arr);
        System.out.println("maximum value is:"+(sum-value1));
        int value2=max(arr);
        System.out.println("minimum value is"+(sum-value2));
    }
}
