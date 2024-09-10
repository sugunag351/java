package calculate_discount;

public class discount
{
        static int discont(int...a)
        {
            int s=0;
            for(int i=0;i<a.length;i++)
            {
                s=s+a[i];
            }
            if(s<500)
            {
                return 10;
            }
            else if(s>=500 && s<=1000)
            {
                return 15;
            }
            return 30;
        }
        public static void main(String args[])
        {
            System.out.println("discount is:"+discont(10,20,30,40,1000)+" percent");
        }
}

