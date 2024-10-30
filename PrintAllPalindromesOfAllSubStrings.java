package programming21;

public class PrintAllPalindromesOfAllSubStrings
{
    static boolean isPalindrome(String t)
    {
        int i=0,j=t.length()-1;
        while(i<j)
        {
            if(t.charAt(i)==t.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    static void meth(String s)
    {
        for(int n=s.length();n>0;n--)
        {
            for (int i = 0; i <= s.length() - n; i++)
            {
                String t = "";
                for (int j = i; j < n + i; j++)
                {
                    t = t + s.charAt(j);
                }
                if(isPalindrome(t)) {
                    System.out.println(t);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        String s="mississippi";
        meth(s);
    }
}
