//java program to illustrate Unary NOT operator
//importing required classes 
import java.io.*;
public class GFG1
{
    //Main driver method 
    public static void main(String args[])
    {
        //initialising variables 
        boolean cond=true;
        int a=10,b=1;
        //Displaying values stored  above variables
       System.out.println("cond is:"+cond);
       System.out.println("var1:"+a);
       System.out.println("var2:"+b);

       //displaying values stored in above variables 
       //after applying unary NOT operartors 
       System.out.println("now cond is:"+!cond);
       System.out.println("!(a<b)="+!(a<b));
       System.out.println("!(a>b)="+!(a>b));
       


    }
}