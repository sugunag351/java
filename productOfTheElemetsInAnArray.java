package programming5;

import java.util.Scanner;

public class productOfTheElemetsInAnArray
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
        int product=1;
        for(int i=0;i<arr.length;i++)
        {
            product*=arr[i];
        }
        System.out.println(product);
    }
}
