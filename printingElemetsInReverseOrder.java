package programming5;

import java.util.Scanner;

public class printingElemetsInReverseOrder
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--)
        {
                System.out.print(arr[i] + " ");
        }
    }
}
