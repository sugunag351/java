package programming19;

import java.util.Scanner;

public class PrintLastIndexOfGivenCharacter
{
    static int meth(String s,char k)
    {
        for(int i=s.length()-1;i>=0;i--)
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
