package collection_framework.list;

import java.util.*;

public class TestVector
{
    public static void main(String[] args)
    {
        Vector<Integer> obj1=new Vector<>();
        obj1.add(10);
        obj1.add(20);
        obj1.add(30);
        obj1.addElement(40);
        System.out.println(obj1+"\ncurrent capacity of veoctor:"+obj1.capacity());

        Vector<Integer> obj2=new Vector<>(15);
        System.out.println(obj2+"\ncurrent capacity of veoctor:"+obj2.capacity());

        Vector<Integer> obj3=new Vector<>(5,3);
        for(int i=1;i<=6;i++)
        {
            obj3.add(i);
        }
        System.out.println(obj3+"\ncurrent capacity of veoctor:"+obj3.capacity());

        Vector obj4=new Vector(2);
        obj4.add(10);
        obj4.add("suguna");
        obj4.add(20);
        System.out.println(obj4+"\ncurrent capacity of veoctor:"+obj4.capacity());
    }
}
