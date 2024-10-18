package programming18;

public class RemoveSpecialCharactersFromString
{
    public static void main(String[] args)
    {
        String s="hello@123";
        System.out.println(s.replaceAll("\\W",""));
    }
}
