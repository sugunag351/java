package programming18;

public class AddIntegersInaString
{
    static String meth(String s)
    {
        String t="";
        char ch;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z'))
            {
                t=t+ch;
            }
            else if(ch>='0' && ch<='9')
            {
                sum=sum+ch-48;
            }
        }
        return sum==0? t : t+sum;
    }
    public static void main(String []args)
    {
        String s="He5l3#lo7";
        System.out.println(meth(s));
    }
}
