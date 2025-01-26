package reversing_array;

public class reversing_array
{
    static void reverse(int a[],int b[])
    {

        for(int i=a.length-1,j=0;i>=0;i--,j++)
        {
            b[j]=a[i];
        }
        System.out.print("reversing arary elements array are:");
       for(int x:b)
       {
           System.out.print(x+" ");
       }
    }
    public static void main(String args[])
    {

        int a[]={1,2,3,4,5};
        int b[]=new int[5];
        reverse(a,b);


    }
}
