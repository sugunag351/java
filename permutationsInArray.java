package programming6;

import java.util.Scanner;

public class permutationsInArray
{
    static void MaxAndMin(int[] arr2)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]>max)
            {
                max=arr2[i];
            }
            if(arr2[i]<min)
            {
                min=arr2[i];
            }
        }
        System.out.println("maximum element is:"+max);
        System.out.println("minimum element is:"+min);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[] arr1={3,5,1,2,4};
        int[] arr2=new int[5];
        for(int i=0;i<arr1.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr1.length;j++)
            {
                if(i==j)
                {

                }
                else
                {
                   sum=sum+arr1[j];
                }
            }
            System.out.print(sum+" ");
            arr2[i]=sum;
        }
        System.out.println();
        MaxAndMin(arr2);
    }
}
