package programming18;

import javax.swing.*;

public class ArrangeStringFromLeftToRight
{
    static String meth(String s)
    {
        String t1="",t2="",t3="",t4="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z')   ) {  t1=t1+ch; }
            else if(ch>='a' && ch<='z') {  t2=t2+ch; }
            else if(ch>='0' && ch<='9') {  t3=t3+ch; }
            else                        {  t4=t4+ch; }
        }
       return t1+t2+t3+t4;
    }
    public static void main(String []args)
    {
        String s="Hello@5$WORLD7";
        System.out.println(meth(s));
    }
}
