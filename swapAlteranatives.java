package CodingNinjas_Arrays;

public class swapAlteranatives
{
    public static void main(String[] args)
    {
        int ar[]={9,3,6,12,4,32,5,11,19};
        int temp;
        for(int i=0;i<ar.length-1;i=i+2)
        {
            temp=ar[i];
            ar[i]=ar[i+1];
            ar[i+1]=temp;
        }
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
