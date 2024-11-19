package CodingNinjas_Arrays2;

public class SelectionSort
{
    static void selectionsort(int[] ar)
    {
        int n=ar.length,min,temp;
        for(int i=0;i<n-1;i++)
        {
            min=Integer.MAX_VALUE;
            temp=-1;
            for(int j=i;j<n;j++)
            {
                if(ar[j]<min)
                {
                    min=ar[j];
                    temp=j;
                }
            }
            ar[temp]=ar[i];
            ar[i]=min;
        }
    }
    public static void main(String[] args)
    {
        int[] ar={1,3,0,4,2,7,6};
        selectionsort(ar);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
