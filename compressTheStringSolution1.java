package CodingNinjas_Strings;

public class compressTheStringSolution1
{
    static String meth(String str)
    {
        int i=0;
        String output="";
        int n=str.length()-1;
        while(i<n)
        {
            int count=1;
            while(i!=n && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            if(count!=1){ output=output+str.charAt(i)+count; }
            else{ output=output+str.charAt(i); }
            if(i!=n){ i++; }
        }
        if(str.charAt(i)!=str.charAt(i-1)){ output=output+str.charAt(i); }
        return output;
    }
    public static void main(String[] args)
    {
        String str="aaabbcddeeeee";
        System.out.println(meth(str));
    }
}
