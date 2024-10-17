package programming17;

public class CountWordsInaString
{
    static int meth(String s)
    {
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return s.charAt(0)==' '?count:count+1;
    }
    public static void main(String[] args)
    {
        String s="  How    Are   You  ";
        System.out.println(meth(s));
    }
}
