package collection_framework.list;

import java.util.*;

public class TestStack
{
    public static void main(String[] args)
    {
        Stack obj1=new Stack();
        obj1.add(10);
        obj1.addElement("suguna");
        obj1.push(20);
        System.out.println(obj1.search(10));
        System.out.println(obj1.pop());
        System.out.println(obj1.peek());
        System.out.println(obj1.search(10));
        System.out.println(obj1.search("suguna"));
        System.out.println(obj1.isEmpty());
        System.out.println(obj1.pop());
        System.out.println(obj1.pop());
        System.out.println(obj1.isEmpty());

        Stack<String> obj2=new Stack<>();
        obj2.push("s");
        obj2.push("u");
        obj2.push("g");
        obj2.push("u");
        obj2.push("n");
        obj2.push("a");
        System.out.println(obj2.search("suguna"));
        System.out.println(obj2.search("a"));
        System.out.println(obj2.search("u"));
        System.out.println(obj2.search("s"));
        System.out.println(obj2.peek());
    }
}
