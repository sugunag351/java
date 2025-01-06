package CodingNinjas_Strings;

public class HighestOccuringCharacter
{
    public static void main(String[] args)
    {
        String str="sugunaa";
        int max=Integer.MIN_VALUE;
        char element=' ';
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                element=str.charAt(i);
            }
        }
        System.out.println(element);
    }
}
