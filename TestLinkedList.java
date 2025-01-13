package collection_framework.list;

import java.util.*;

public class TestLinkedList
{
    public static void main(String[] args) {
        List al = new LinkedList();// initially it creates an array of size 10
        al.add("suguna");
        al.add("ravi");
        al.add("vijay");
        al.add(10);
        System.out.println(al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        LinkedList<Integer> ali = new LinkedList<Integer>();
        ali.add(10);
        ali.add(20);
        ali.add(null);// we can add null because null value is the dafault value of Integer wrapper class
        System.out.println(ali);

        LinkedList al2 = new LinkedList(ali);
        al2.addFirst("suguna");
        al2.addLast("su2");
        System.out.println(al2);
        System.out.println(al2.getFirst());
        System.out.println(al2.getLast());
        al2.removeFirst();
        al2.removeLast();
        System.out.println(al2);

    }

}
