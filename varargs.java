package varargs;

public class varargs
{
    static void showlist(int start,String...x)
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.println(start+"."+x[i]);
            start++;
        }
    }
    public static void main(String args[])
    {
        showlist(5,"suguna","meghana","bhoomika","susmitha","vidya");

    }
}
