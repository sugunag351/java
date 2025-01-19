package collection_framework;

import java.util.Enumeration;
import java.util.Vector;

public class enumeration
{
    //Enumeration is used for traversing vectors and stack collections only
    public static void main(String[] args)
    {
        Vector<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        Enumeration e=list.elements();
        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement()+" ");
        }

    }

}
