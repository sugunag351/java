package UserDefinedAnnotations;
@interface myanno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}
@myanno(name="ajay",project = "bank")
public class test
{
    int data;
    public static void main(String args[])
    {
        int x;
    }
}
