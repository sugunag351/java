package methods;

import java.util.Scanner;

public class grades
{
    static String grade(int n)
    {
        if(n>=91 && n<=100)
        {
            return "AA";
        }
        else if(n>=80 && n<=90)
        {
            return "AB";
        }
        return "fail";
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.println("grade is:"+grade(x));
    }
}
