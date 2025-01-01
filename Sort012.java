package CodingNinjas_Arrays2_Assignment;

public class Sort012
{
    static void Sorting(int[] ar)
    {
        int i=0,j=0,k=ar.length-1,temp;
        while(i<=k)
        {
            if(ar[i]==0)
            {
                temp=ar[i];
              ar[i]=ar[j];
              ar[j]=temp;
              j++;
              i++;
            }
            else if(ar[i]==2)
            {
                temp=ar[i];
                ar[i]=ar[k];
                ar[k]=temp;
                k--;
            }
            else
            {
                i++;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] ar={2,0,1,2,0,2,1,0,2};
        Sorting(ar);
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
}
