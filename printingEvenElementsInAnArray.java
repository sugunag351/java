package programming5;

import java.util.Scanner;

public class printingEvenElementsInAnArray
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
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
