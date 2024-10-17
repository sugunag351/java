package programming17;

public class countSpacesInaString
{
    static void meth(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        String s="How Are You";
        meth(s);
    }
}
