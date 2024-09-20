package consumertest;
class consumer
{
    private String id;
    private String name;
    private String address;
    private String phoneno;
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhoneno()
    {
        return phoneno;
    }
    public void setAddress(String a)
    {
        address=a;
    }
    public  void setPhoneno(String p)
    {
        phoneno=p;
    }

    public consumer(String id,String name)
    {
        System.out.println("consumers are:");
        System.out.println("id is:"+id);
        System.out.println("name is:"+name);
    }
    public consumer(String id,String name,String a ,String p)
    {
        System.out.println("consumer1 is:");
        System.out.println("id is:"+id);
        System.out.println("name is:"+name);
        setAddress(a);
        setPhoneno(p);
    }
}
public class consumertest
{
    public static void main(String args[])
    {
        consumer c=new consumer("1","suguna","anatapur","9347098340");
        System.out.println(c.getPhoneno());
        System.out.println(c.getAddress());
        consumer c1=new consumer("2","soujanya");


    }
}
