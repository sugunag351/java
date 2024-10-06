package programming7;

public class productOfAllTheElementsRegardingThatIndex
{
    public static void main(String[] args)
    {
        int n=5;
        int arr[]={3,5,1,2,4};
        int res[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            res[i]=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i==j) {}
                else {
                   res[i]=res[i]*arr[j];
                }
            }
        }
        for(int x:res)
        {
            System.out.print(x+" ");
        }
    }
}
