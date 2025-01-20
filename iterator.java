package collection_framework;

import java.util.Iterator;
import java.util.Vector;

public class iterator
{
    public static void main(String[] args)
    {
        //Iterator is used for all the collections
        Vector<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        Iterator<Integer> e=list.iterator();
        while(e.hasNext())
        {
            Integer current=e.next();
            if(current==30)
            {
                e.remove();
            }
            else
            {
                System.out.print(current+" ");
            }
        }
        //remove method is designed to remove the last element returned by the next() method
        //Always call next() method before calling remove() method when using  an Iterator
    }
}
