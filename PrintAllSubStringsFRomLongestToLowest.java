package programming21;

public class PrintAllSubStringsFRomLongestToLowest
{
    static void meth(String s)
    {
        for(int n=s.length();n>0;n--)
        {
            System.out.println("subStrings Of Size :"+n);
            for (int i = 0; i <= s.length() - n; i++)
            {
                String t = "";
                for (int j = i; j < n + i; j++)
                {
                    t = t + s.charAt(j);
                }
                System.out.println(t);
            }
        }
    }
    public static void main(String[] args)
    {
        String s="mississippi";
        meth(s);
    }
}
