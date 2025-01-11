package CodingNinjas_Strings;

public class ReverseStringWordWiseSolution2
{
    static String Reverse(String str)
    {
        int end=str.length()-1,start;
        String output="";
        for (int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ' || i==0)
            {
                if(i==0)
                {
                    start=0;
                    output=output+str.substring(start,end+1);
                }
                else
                {
                    start =i+1;
                    output=output+str.substring(start,end+1)+" ";
                }
                end=i-1;
            }
        }
        return output;
    }
    public static void main(String[] args)
    {
        String str="Welcome to Coding Ninjas";
        System.out.println(Reverse(str));
    }
}
