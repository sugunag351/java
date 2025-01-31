package sigletonclass;
class coffeemachine {
    private float coffeeqty;
    private float milkqty;
    static private coffeemachine my = null;
    static int count = 0;

    static coffeemachine getIstance() {

        while (my == null) {
            my = new coffeemachine();
        }
        if (count <5) {
            count++;
            return my=new coffeemachine();
        }
        return null;
    }
}
public class singletonclass
{
    public static void main(String args[])
    {
        coffeemachine m1=coffeemachine.getIstance();
        coffeemachine m2=coffeemachine.getIstance();
        coffeemachine m3=coffeemachine.getIstance();
        coffeemachine m4=coffeemachine.getIstance();
        coffeemachine m5=coffeemachine.getIstance();
        coffeemachine m6=coffeemachine.getIstance();


        System.out.println(m1+" : "+m2+" : "+m3+" : "+m4+" : "+m5);
        if(m1==m2 && m1==m3 && m1==m4 && m1==m5)
        {
            System.out.println(coffeemachine.count+"  same objects");
        }
        else {
            System.out.println(coffeemachine.count+" different objects");
        }


    }
}
