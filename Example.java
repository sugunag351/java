package JavaDocumentation;
import java.util.*;

/**
 * @author suguna
 */
public class Example
{
    /**
     * this is a program for adding two numbers
     * @param a
     */
    public static void main(String a[])
    {
        /**
         * declaring two integers x and y
         */
        int x,y;
        /**
         * taking two inputs from the user using Scanner class
         */
        Scanner s=new Scanner(System.in);
         x=s.nextInt();
         y=s.nextInt();
        /**
         * adding two numbers storing sum variable
         */
        int sum=x+y;
        System.out.println(sum);

    }
}
