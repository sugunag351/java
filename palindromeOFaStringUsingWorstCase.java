package Programming16;

public class palindromeOFaStringUsingWorstCase
{
    static String  isPalindrome(String s)
    {
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
            str=str+s.charAt(i);
        }
        return str;
    }
    public static void main(String[] args)
    {
        String s="malayalam";
        String str=isPalindrome(s);
        if(str.equals(s))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }

    }
}
