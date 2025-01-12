package collection_framework.list;
import java.util.*;
public class TestArrayList
{
    public static void main(String args[])
    {
        List al=new ArrayList();// initially it creates an array of size 10
        al.add("suguna");
        al.add("ravi");
        al.add("vijay");
        al.add(10);
        System.out.println(al);
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ArrayList<Integer> ali=new ArrayList<Integer>(2000);// initially it creates an array of size 2000
        ali.add(10);
        ali.add(20);
        ali.add(null);// we can add null because null value is the dafault value of Integer
        System.out.println(ali);

        ArrayList al2=new ArrayList(ali);
        al2.addAll(al);
        System.out.println(al2);


    }
}
