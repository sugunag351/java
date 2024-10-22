package programming19;

public class convetLowercaseToUppercase
{
    static void meth(String s)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                t=t+(char)(ch-32);
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
        String s="heloo@123";
        meth(s);
    }
}
