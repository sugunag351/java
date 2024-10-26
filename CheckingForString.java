package programming20;

public class CheckingForString
{
    static String meth(String s,String t)
    {
        int si=0;
        String s2="";
        for(int i=0;i<t.length();i++)
        {
            for(int j=si;j<s.length();j++)
            {
                if(t.charAt(i)==s.charAt(j))
                {
                    si=j+1;
                    s2=s2+s.charAt(j);
                    break;
                }
            }
        }
        if(s2.equals(t))
        {
            return "yes";
        }
        return "no";

    }
    public static void main(String[] args)
    {
        String s="hereiamstackerrank";
        String t="hackerrank";
        System.out.println(meth(s,t));
    }
}
