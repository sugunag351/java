package programming19;

public class convertUppercaseToLowercase
{
    static void meth(String s)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                t=t+(char)(ch+32);
            }
            else
            {
                t=t+ch;
            }
        }
        System.out.println(t);
    }
    public static void main(String[] args)
    {
        String s="HELLO@123";
        meth(s);
    }
}
