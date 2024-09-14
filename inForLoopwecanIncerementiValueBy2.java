package programming2;



public class inForLoopwecanIncerementiValueBy2
{
    public static void main(String a[])
    {
        for(int i=1,j=1,k=1; i<=10&& j<=10;i=i+2,j=j+2,k++,k++)
        {
            System.out.println(i+" * "+j+" = "+i*j);
            System.out.println("k value is:"+k);
        }
    }
}
