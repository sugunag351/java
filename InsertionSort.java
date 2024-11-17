package CodingNinjas_Arrays2;

public class InsertionSort
{
    static void insertionSort(int[] ar)
    {
        int n=ar.length,j,temp;
        for(int i=1;i<n;i++)
        {
            j=i-1;
            temp=ar[i];
            while(j>=0 && ar[j]>temp)
            {
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=temp;
        }
    }
    public static void main(String[] args)
    {
        int[] ar={11,9,6,3,7,2,4,5,10,1};
        insertionSort(ar);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
