package CodingNinjas_Strings;

public class compressTheStringSolution2
{
    static String meth(String str)
    {
        String output="";
        int count=1,i;
        for(i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            else
            {
                if(count>1)
                {
                    output=output+str.charAt(i)+count;
                    count=1;
                }
                else { output=output+str.charAt(i); }
            }
        }
        if(count>1){ output=output+str.charAt(i)+count; }
        else { output=output+str.charAt(i); }
        return output;
    }
    public static void main(String[] args)
    {
        String str="aaabbcddeeeee";
        System.out.println(meth(str));
    }
}
