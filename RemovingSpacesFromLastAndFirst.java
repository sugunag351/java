package programming20;

public class RemovingSpacesFromLastAndFirst
{
    static void meth(String s)
    {
        int i=0;
        while(s.charAt(i)==' '){ i++; }
        int j=s.length()-1;
        while(s.charAt(j)==' '){ j--; }
        String t="";
        for(int k=i;k<=j;k++)
        {
            char ch=s.charAt(k);
            t=t+ch;
        }
        System.out.print(t);
    }
    public static void main(String[] args)
    {
        String s="     how    are   you    ";
        meth(s);
    }
}
