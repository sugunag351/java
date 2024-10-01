package InterThreadCommunictaion;
class mydata
{
    int value;
   boolean flag=true;
    synchronized public void set(int v)
    {
        while(flag!=true)
          try{wait();}catch(Exception e){}
        value=v;
        flag=false;
        notify();
    }
  synchronized public int get()
    {
        int x=0;
       while(flag!=false)
           try{wait();}catch(Exception e){}
        x=value;
         flag=true;
         notify();
        return x;
    }
}
class producer extends Thread
{
    mydata d;
    public producer(mydata d)
    {
        this.d=d;
    }
    public void run()
    {
         int i=1;
        while(true)
        {
            d.set(i);
             System.out.println("producer:"+i);
             try{Thread.sleep(1000);}catch(Exception e){}
             i++;
        }
    }
}
class consumer extends Thread
{
    mydata d;
    public consumer(mydata d)
    {
        this.d=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=d.get();
            System.out.println("consumer:"+value);
            try{Thread.sleep(1000);}catch(Exception e){}

        }
    }
}
public class test
{
    public static void main(String args[])
    {
        mydata data=new mydata();
        producer p=new producer(data);
        consumer c=new consumer(data);
        p.start();
        c.start();
    }
}
