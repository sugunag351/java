package CodingNinjas_Arrays2;

public class BinarySearch
{
    static int meth(int[] ar,int x)
    {
        int s=0,e=ar.length-1,mid;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(ar[mid]<x)
            {
                s=mid+1;
            }
            else if(ar[mid]>x)
            {
                e=mid-1;
            }
            else if(ar[mid]==x)
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] ar={1,3,5,7,9};
        int x=9;
        System.out.println(meth(ar,x));

    }
}
