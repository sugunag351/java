package CodingNinjas_Strings;

public class ReverseEachWord
{
    public static void main(String[] args)
    {
        String str="Welcome to Coding Ninjas";
        int start=0,end;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ' || i==str.length()-1)
            {
                if(i==str.length()-1){ end=i; }
                else{ end=i-1; }
                String s="";
                while(start<=end)
                {
                    s=str.charAt(start)+s;
                    start++;
                }
                System.out.print(s+" ");
                start=i+1;
            }
        }
    }
}
