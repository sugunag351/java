package CodingNinjas_Arrays;

public class ArrangeNumbers
{
    public static void main(String[] args)
    {
        int n=11;
        int[] ar=new int[n];
        int k;
        if(n%2==0)
        {
            k=(n-1)/2;
        }
        else
        {
            k=n/2;
        }
        int s=0,e=n-1,val=1;
        while(s<=k)
        {
            ar[s]=val;
            val++;
            if(e>k) {
                ar[e] = val;
                val++;
            }
            s++;
            e--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }

    }
}
