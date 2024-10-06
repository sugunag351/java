package programming7;

public class product
{
    static int[] products(int[] ar)
   {
       int[] res=new int[ar.length];
       int p=1;
       for(int i=0;i<ar.length;i++)
       {
           p=p*ar[i];
       }
       for(int i=0;i<ar.length;i++)
       {
           res[i]=p/ar[i];
       }
       return res;
   }
    public static void main(String a[])
    {
        int ar[]={3,5,1,2,4};
      int[] result=products(ar);
       for(int x:result)
       {
           System.out.print(x+" ");
       }
    }
}
