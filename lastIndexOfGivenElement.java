package programming7;

public class lastIndexOfGivenElement
{
    public static void main(String[] args)
    {
        int k=5;
        int arr[]={1,2,4,5,6,7,5,6,5,9,1};
        int index=0;
       for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
               index=i;
            }
        }
        System.out.println(index);
    }
}
