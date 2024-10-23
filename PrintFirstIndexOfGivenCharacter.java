package programming19;

import java.util.Scanner;

public class PrintFirstIndexOfGivenCharacter
{
    static int meth(String s,char k)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char k=sc.next().charAt(0);
        System.out.println(meth(s,k));
    }
}
