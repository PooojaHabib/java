import java.lang.*;
import java.util.*;

class GeeksforGeeks
{
    public static void main(String args[])
    {
        System.out.println("PRIMITIVE DATA TYPES");
        int x=10;
        int y=x;
        System.out.println("initially:");
        System.out.println("x="+x+",y="+y);
        y=30;
        System.out.println("after changing the value of y");
        System.out.println("x="+x+",y="+y);
        System.out.println("***only value of y is affected here"+"because of primitive data types\n");
        System.out.println("REFERENCE DATA TYPES ");
        int[] c={10,67,98,67};
        //here the complet memory is copied to d
        //and both point to same memory heap
        int[] d=c;
        System.out.println("initially");
        System.out.println("array c:"+Arrays.toString(c));
        System.out.println("array d:"+Arrays.toString(d));
        //modify the value at 
        //index 1 to 50 in array d
        System.out.println("\n Modifying the value at"+"index 1 to 50 in array d");
        d[1]=50;
        System.out.println("After modification");
        System.out.println("Array c:"+Arrays.toString(c));
        System.out.println("Array d:"+Arrays.toString(d));
        System.out.println("**here the value of c[1] is also affected due to reference data types");
        
        
        
        
        
        

    }
}