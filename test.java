package fileClass;

import java.io.File;

public class test
{
    public static void main(String args[])
    {
        File f=new File("c:/users/dell/myjava");
        System.out.println(f.isDirectory());
        String list[]=f.list();
        for(String x:list)
        {
            System.out.println(x);
        }

    }
}
