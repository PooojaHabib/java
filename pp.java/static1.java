//static class
class Mobile
{
    String brand;
    int price; 
    static String name;

    static
    {
        name="phone";
        System.out.println("in static block");

    }
    public Mobile()
    {
        brand="ghgh";
        price=200;
        System.out.println("in constructor");


    }

    public void show()
    {

    System.out.println(brand+":"+price+":"+name);
    }
}
public class static1
{
    public static void main(String args[])throws ClassNotFoundException
    {
        Class.forName("Mobile");
        // Mobile obj1=new Mobile();
        // obj1.brand="Apple";
        // obj1.price=1200000;
        // Mobile.name="smartphone";

        // Mobile obj2=new Mobile();
        
        // obj1.show();
        // obj2.show();

    }
}