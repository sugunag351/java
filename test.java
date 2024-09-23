package enums;
enum dept
{
    CS("john","block A"),IT("suguna","block B"),CIVIL("sindhu","block C"),ECE("sounjanya","block d");
   String name;
    String location;
    dept(String name,String location)
    {
        this.name=name;
        this.location=location;
    }
    public String getname()
    {
        return name;
    }
    public String getLocation()
    {
        return location;
    }

}
public class test {
    public static void main(String a[])
    {

      dept d=dept.IT;
      System.out.println(d.getname());
        System.out.println(d.getLocation());


    }
}
