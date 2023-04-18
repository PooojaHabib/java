//java code illustrate logical AND operator
import java.io.*;
class GFGlogical
{
    public static void main(String args[])
    {
        int a=10,b=29,c=2,d=0;
        System.out.println("var1="+a+",var2="+b+",var3="+c);
        
        //using logical Aand to verify
        //two contraints 
        if((a<b)&&(b==c))
        {
            d=a+b+c;
            System.out.println("the sum is:"+d);
        }
        else 
        System.out.println("false condition");
    }
}