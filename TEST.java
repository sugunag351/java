package REFLECTPACKAGE;

import java.lang.reflect.*;

class my
{
    private int a;
    public int b;
    protected int c;
    int d;
    public my(){}
    public my(int x,int y){}
    public void display(String s1,String s2){}
    public int show(int x,int y,int z){return 0;}
}
public class TEST
{
    public static void main(String a[])
    {
        Class c=my.class;
        System.out.println(c.getName());
        Method meth[]=c.getMethods();
        for(Method x:meth)
        {
            System.out.println(x);

        }

        Parameter p[]=meth[1].getParameters();
        for(Parameter x:p)
        {
            System.out.println(x);

        }
    }
}
