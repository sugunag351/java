package interfaceCallback;
interface member
{
    void callback();
}
class customer implements member{
        String name;
        customer(String n)
        {
            name=n;
        }
        public void callback()
        {
           System.out.println("ok.i will visit:"+name);
        }

}
class store {
    member mem[]=new member[100];
    int count=0;
    public void register(member m)
    {
        mem[count++]=m;
    }
    public void invitesale()
    {
        for(int i=0;i<count;i++)
            mem[i].callback();
    }
}
public class interfaceCallback {
    public static void main(String args[])
    {
        store t=new store();
        customer c1=new customer("john");
        customer c2=new customer("smith");
        t.register(c1);
        t.register(c2);
        t.invitesale();

    }
}
