package subject;
class subject
{
    private String subjid;
    private String name;
    private int maxmarks;
    public subject(String id,String n,int m)
    {
        subjid=id;
        name=n;
        setMaxmarks(m);
    }
    public subject(String id,String n)
    {
        subjid=id;
        name=n;
    }
    public String  getsubjid()
    {
        return subjid;
    }
    public String getName()
    {
        return name;
    }
    public int getMaxmarks()
    {
        return maxmarks;
    }
    public void setMaxmarks(int m)
    {
        maxmarks=m;
    }
    public String toString()
    {
        return subjid+":"+name+":"+maxmarks;
    }
}
public class subjectTest
{
    public static void main(String args[])
    {
        /*subject s=new subject("1","suguna",50);
        subject s1=new subject("2","soujanya");
        System.out.println(s.getsubjid()+":"+s.getName()+":"+s.getMaxmarks());
        System.out.println(s1.getsubjid()+":"+s1.getName());
        System.out.println(s);*/
        subject subs[]=new subject[3];
        subs[0]=new subject("101","suguna",100);
        subs[1]=new subject("101","suguna",100);
        subs[2]=new subject("101","suguna",100);
        for(subject s:subs)
        {
                System.out.println(s);
        }
    }
}
