package programming17;

public class countConsonantsInaStirng
{
    static void meth(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            {
                if(!(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' ||
                        ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U'))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        String s="hello@123";
        meth(s);
    }
}
