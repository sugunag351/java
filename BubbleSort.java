package CodingNinjas_Arrays2;

public class BubbleSort
{
    static void bubblesort(int[] ar)
    {
        int n=ar.length,temp;
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={4,3,6,8,1,5,7};
        bubblesort(ar);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
