package CodingNinjas_Strings;

public class RemoveConsecutiveDuplicates
{
    static String remove(String str)
    {
        int i=0;
        String output="";
        while(i<str.length()-1)
        {
            char ch=str.charAt(i);
            if(ch!=str.charAt(i+1))
            {
                output=output+ch;
            }
            i++;
        }
        output=output+str.charAt(i);
        return output;
    }
    public static void main(String[] args)
    {
        String str="xxyyzxx";
        System.out.println(remove(str));
    }
}
