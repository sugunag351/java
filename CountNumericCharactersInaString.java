package programming17;

public class CountNumericCharactersInaString
{
    static void meth(String s)
    {
    int count=0;
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch>='0' && ch<='9')
        {
                count++;
        }
    }
        System.out.println(count);
}
    public static void main(String[] args)
    {
        String s="hel356lo@011";
        meth(s);
    }
}
