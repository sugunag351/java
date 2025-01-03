package CodingNinjas_Strings;

public class checkPermutationOfStrings
{
    static boolean permutation(String str1,String str2)
    {
        if (str1.length() != str2.length())
        {
            return false;
        }
        int frequency[]=new int[256];
        for(int i=0;i<256;i++)
        {
            frequency[i]=0;
        }
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            ++frequency[ch];
        }
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            --frequency[ch];
        }
        for(int i=0;i<256;i++)
        {
            if(frequency[i]!=0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        String str1="abca";
        String str2="bacb";
       System.out.println(permutation(str1,str2));
    }
}
