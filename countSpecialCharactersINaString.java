package programming17;

public class countSpecialCharactersINaString
{
    static void meth(String s)
    {
    int count=0;
        for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')))
        {
                count++;
        }
    }
        System.out.println(count);
}
    public static void main(String[] args)
    {
        String s="hello$%@123";
        meth(s);
    }
}
