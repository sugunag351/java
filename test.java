package SequenceInputStream;
import java.io.*;
public class test
{
    public static void main(String args[])throws Exception
    {
        FileInputStream fis1=new FileInputStream("c:/users/dell/myjava/my.txt");
        FileInputStream fis2=new FileInputStream("c:/users/dell/myjava/source4.txt");
        FileOutputStream fos=new FileOutputStream("c:/users/dell/myjava/destination.txt");
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        try(fis1;fis2;fos;sis)
        {
            int x;
            while((x=sis.read())!=-1)
            {
                fos.write(x);
            }
        }

    }
}
