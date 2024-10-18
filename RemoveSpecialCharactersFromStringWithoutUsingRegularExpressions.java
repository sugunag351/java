package programming18;

public class RemoveSpecialCharactersFromStringWithoutUsingRegularExpressions
{
    static void meth(String s)
    {
        String t="";
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
            {
                t=t+ch;
            }
        }
        System.out.println(t);
    }
    public static void main(String []args)
    {
        String s="hello@123";
        meth(s);
    }
}
