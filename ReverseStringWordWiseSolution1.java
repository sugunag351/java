package CodingNinjas_Strings;

public class ReverseStringWordWiseSolution1
{
    static void Reverse(String str)
    {
        int end=str.length()-1,start;
        for (int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ' || i==0)
            {
                if(i==0){ start=0; }
                else { start =i+1; }
                String s="";
                while(start<=end)
                {
                    s=s+str.charAt(start);
                    start++;
                }
                System.out.print(s+" ");
                end=i-1;
            }

        }
    }
    public static void main(String[] args)
    {
        String str="abc def ghi";
        Reverse(str);
    }
}
