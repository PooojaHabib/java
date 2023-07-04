//static method
class Mobile
{
    String brand;
    int price; 
    static String name;

    

    public void show()
    {

    System.out.println(brand+":"+price+":"+name);
    }
    public static void show1(Mobile obj2)
    {
        System.out.println(obj2.brand+":"+obj2.price+":"+name);
    }
}
public class static2
{
    public static void main(String args[])
    {
        
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1200000;
        Mobile.name="smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1878;
        Mobile.name="smartphone";

        Mobile.name="Phone";
        
        obj1.show();
        obj2.show();
        Mobile.show1(obj2);

    }
}