//java program to iilustrate 
//bitwise operators 
public class operators
{
    public static void main(String args[])
    {
        int a=5;
        int b=7;
        //bitwise and 
        // 0101 & 0111=0101=5
        System.out.println("a&b="+(a&b));
        //bitwise or 
        // // 0101 | 0111=0101=7
        System.out.println("a|b="+(a|b));

        //bitwise xor
        //0101^0111=0011=2
        System.out.println("a^b="+(a^b));
        //bitwise not
        //~0000000000 00000000000 0000000000 000000101=1111111 1111111 1111111 111111010
        //will give 2's complement (32 bit)of 5=-6
        System.out.println("a~="+~a);

        //can also b combined with 
        //assignment operator to provide shorthand
        //assignment
        //a-a&b 
        //a&=b;
        a&=b;
        System.out.println("a="+a);

    }
    
}