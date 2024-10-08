package programming9;

public class printMaxCountOfRepeatedElement
{
    static void meth(int[] ar)
    {
        int count=1,maxc=0,ele=0,i;
        for(i=0;i<ar.length-1;i++)
        {
            if(ar[i]==ar[i+1])
            {
                count++;
            }
            else
            {
                if(count>maxc)
                {
                    maxc=count;
                    ele=ar[i];
                }
                count=1;
            }
        }
        if(count>maxc)
        {
            maxc=count;
            ele=ar[i];
        }
        System.out.println(ele+"-"+maxc);

    }
    public static void main(String[] args)
    {
        int[] ar={3,3,6,7,7,8,8,8,10,10,10,10};
        meth(ar);

    }
}
