package ByteArrayStreams;
import java.io.*;
public class test
{
    public static void main(String args[])throws Exception
    {
        FileReader fos=new FileReader("c:/users/dell/myjava/my.txt");
        BufferedReader bis=new BufferedReader(fos);
            System.out.println(bis.readLine());






    }
}
