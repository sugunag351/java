package human;
class human
{
    private int age;
    private String name;
    public human()
    {
        age=18;
        name="suguna";
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
       this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}
public class demo
{
    public static void main(String args[])
    {
        human obj=new human();
        System.out.println(obj.getAge()+":"+obj.getName());
        obj.setAge(20);
        obj.setName("soujanya");
        System.out.println(obj.getAge()+":"+obj.getName());
    }
}
