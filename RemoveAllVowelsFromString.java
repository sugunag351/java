package programming18;

public class RemoveAllVowelsFromString
{
    static void meth(String s)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' ||
                    ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U'))
            {
                t=t+ch;
            }
        }
        System.out.println(t);
    }
    public static void main(String[] args)
    {
        String s="hello@5#";
        meth(s);
    }
}
