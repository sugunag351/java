package Programming16;

public class ReverseOfAString
{
    static void Reverse(String s)
    {
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
            str=str+s.charAt(i);
        }
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        String s="suguna";
        Reverse(s);
    }
}
