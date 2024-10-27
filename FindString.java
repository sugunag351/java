package programming20;

public class FindString
{
    static String meth(String s,String t)
    {
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        return j==t.length() ? "yes" : "no" ;
    }
    public static void main(String []args)
    {
        String s="hereiamstackerrank";
        String t="hackerrank";
       System.out.println(meth(s,t));
    }
}
