//create class file-blueprint
//who creates class-jvm
//class file-byte code-jvm-object
//every object has two things properties and methods 
class Calculator
{
    int x;
    public int add(int n1,int n2)
    {
       int r=n1+n2;
        return r;
    }
}

public class object
{
     public static void main(String args[])
    {
        int a=1;
        int b=9;
        Calculator calc=new Calculator();
        int result=calc.add(a,b);
        
         
      //  int result=a+b;
        System.out.println(result);
    }

}