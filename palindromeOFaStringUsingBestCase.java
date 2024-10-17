package Programming16;

public class palindromeOFaStringUsingBestCase
{
    static boolean isPalindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s="malayalam";
        if(isPalindrome(s))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }

    }
}
