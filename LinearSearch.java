package CodingNinjas_Arrays2;

public class LinearSearch
{
    public static int linear(int[] ar,int key)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] ar={2,3,4,9,3,1};
        int key=9;
        System.out.println("key is found at index:"+linear(ar,key));
    }
}
