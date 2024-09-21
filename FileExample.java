package CopyingFile;
import java.io.*;
public class FileExample
{
    public static void main(String args[])throws Exception
    {
        FileInputStream fis=new FileInputStream("c:/users/dell/myjava/my.txt");
        FileOutputStream fos=new FileOutputStream("c:/users/dell/myjava/source4.txt");

        try (fis;fos)
        {

            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            String a=str.toUpperCase();
            System.out.println(a);

            fos.write(a.getBytes());
        }

    }
}
