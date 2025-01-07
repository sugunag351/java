package CodingNinjas_Strings;

public class RemoveCharacter
{
    static String meth(String str,char ch1)
    {
        String output="";
        for(int i=0;i<str.length();i++)
        {
            char ch2=str.charAt(i);
            if(ch1!=ch2)
            {
                output = output + ch2;
            }
        }
        return output;
    }
    public static void main(String[] args)
    {
        String str="aabccbaa";
        char ch1='a';
        System.out.println(meth(str,ch1));
    }
}
