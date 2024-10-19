package programming19;

public class concatenateStarBeforeCharactera
{
    static void meth(String s)
    {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a')
            {
                t=t+"*"+ch;
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
        String s="banana";
        meth(s);
    }
}
