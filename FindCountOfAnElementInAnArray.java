package programming6;

import java.util.Scanner;

public class FindCountOfAnElementInAnArray
{
    static int maximum(int[] arr,int n)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int a=s.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.println(maximum(arr,a));

    }
}
