package userdefinedStackClassPractice;

class stackoverflowException extends RuntimeException
{
    public String toString()
    {
        return "your stack is full";
    }

}
class stackunderflowException extends RuntimeException
{
    public String toString()
    {
       return "your stack is empty";
    }

}
class stack
{
    int size;
    int top=-1;
    int s[];
    public stack(int sz)
    {
       size=sz;
       s=new int[sz];
    }
    public void push(int x)throws stackoverflowException
    {
        if(top==size-1)
        {
            throw new stackoverflowException();
        }
        else {
            top++;
            s[top]=x;
        }
    }
    public void pop()throws stackunderflowException
    {

        if(top==-1)
        {
            throw new stackunderflowException();
        }
        else {

            top--;
            System.out.println(s[top]);
        }
    }
}

public class test {
    public static void main(String args[])
    {
       stack a=new stack(5);
       try {
           a.pop();
       }
       catch(stackunderflowException e)
       {
           System.out.println(e);
       }



    }

}

