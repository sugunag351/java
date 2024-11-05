package programming21;

public class PrintSubStringsOfSizeFour
{

    static void meth(String s,int n)
    {
        for(int i=0;i<=s.length()-n;i++)
        {
            String t="";
            for(int j=i;j<n+i;j++)
            {
                t=t+s.charAt(j);
            }
            System.out.println(t);
        }
    }
    public static void main(String[] args)
    {
        String s="mississippi";
        int n=4;
        meth(s,n);
    }
}
