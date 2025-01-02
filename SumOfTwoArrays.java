package CodingNinjas_Arrays2_Assignment;

public class SumOfTwoArrays
{
    static void sumOfTwoArrays(int[] ar1,int[] ar2,int[] ar3)
    {
        int i=ar1.length-1,j=ar2.length-1,k=ar3.length-1,carry=0,n,first;
        while(i>=0 && j>=0)
        {
            n=ar1[i]+ar2[j];
            first=n%10;
            ar3[k]=first+carry;
            carry=n/10;
            i--;
            j--;
            k--;
        }
        while(i>=0)
        {
            n=ar1[i]+carry;
            first=n%10;
            ar3[k]=first;
            carry=n/10;
            i--;
            k--;
        }
        while(j>=0)
        {
            n=ar1[j]+carry;
            first=n%10;
            ar3[k]=first;
            carry=n/10;
            j--;
            k--;
        }
        ar3[k]=carry;
    }
    public static void main(String[] args)
    {
        int[] ar1={9,7,6,1};
        int[] ar2={4,5,9};
        int size= ar1.length>ar2.length ? ar1.length : ar2.length ;
        int[] ar3=new int[size+1];
        sumOfTwoArrays(ar1,ar2,ar3);
        for(int x:ar3)
        {
            System.out.print(x+" ");
        }
    }
}
