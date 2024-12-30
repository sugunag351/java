package CodingNinjas_Arrays2_Assignment;

public class RotateArraySolution4
{
    static void revrse(int[] ar,int i,int j)
    {
        int temp;
        while(i<j)
        {
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args)
    {
        int[] ar={2,6,3,1,5,9,8};
        int d=8;
        if(d>=ar.length && ar.length!=0)
        {
            d=d%ar.length;
        }
        if(ar.length==0)
        {
            return;
        }
        revrse(ar,0,ar.length-1);
        revrse(ar,0,ar.length-d-1);
        revrse(ar,ar.length-d,ar.length-1);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
