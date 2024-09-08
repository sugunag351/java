package methods;
import java.util.*;

public class maxandminofnumbers
{
     static int max(int a,int b,int c)
    {
        int num1=a>b && a>c ? a:b>a && b>c ? b : c;
        return num1;
    }
    static int min(int x, int y,int z)
    {
        int num2=x<y && x<z ? x :y<x && y<z ? y :z;
        return num2;
    }
    public  static  void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println("maximum value of three numbers is:"+max(a,b,c));
        System.out.println("minimum value of three numbers is:"+min(a,b,c));
    }
}
