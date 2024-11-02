package programming21;

public class PrintCountOfPalindromesInaSubString
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
    static void meth(String s,int n)
    {
        int count=0;
        for(int i=0;i<=s.length()-n;i++)
        {
            String t="";
            for(int j=i;j<n+i;j++)
            {
                t=t+s.charAt(j);
            }
            if(isPalindrome(t))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        String s="mississippi";
        int n=5;
        meth(s,n);
    }
}
