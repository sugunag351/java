package sum_of_all_elements;

public class elements
{
    static int sum(int...a)
    {
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s=s+a[i];
        }
        return s;
    }
    public static void main(String args[])
    {
        System.out.println("sum of all the elements are:"+sum(10,20,30,40));
    }
}
