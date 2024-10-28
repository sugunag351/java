package programming20;

public class RemovingExtraSpacesFromString
{
    static void meth(String s)
    {
        int i=0;
        while(s.charAt(i)==' '){ i++; }
        int j=s.length()-1;
        while(s.charAt(j)==' '){ j--; }
        String t="";
        for(int k=i;k<j;k++)
        {
           char ch1=s.charAt(k);
            char ch2=s.charAt(k+1);
            if(ch1!=' ' || ch2!=' ')
            {
                t=t+ch1;
            }
        }
        System.out.print(t+s.charAt(j));
    }
    public static void main(String[] args)
    {
        String s="   how    are   you    ";
        meth(s);
    }
}
