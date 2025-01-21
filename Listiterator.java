package collection_framework;

import java.util.*;

public class Listiterator
{
    public static void main(String[] args)
    {
        //ListIterator is used in list collection only
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(scan.hasNextInt())
        {
            int x=scan.nextInt();
            list.add(x);
        }
        ListIterator<Integer> e=list.listIterator();
        e.add(200);
       // before using set() method first we should use previous() or next() method
        System.out.println(e.previous());
        e.set(100); // it change the element at current position(at current cursor)
        while(e.hasNext())
        {
            System.out.print(e.next()+" ");
        }
        System.out.println();
        while(e.hasPrevious())
        {
            System.out.print(e.previous()+" ");
        }
        System.out.println();
        System.out.println(e.nextIndex());
        e.next();
        System.out.println(e.previousIndex());
        e.remove();
        while(e.hasNext())
        {
            System.out.print(e.next()+" ");
        }
    }
}
