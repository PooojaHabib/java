import java.io.*;
class rec1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        int l,b,area,peri;
        System.out.println("enter the value of l =");
        System.out.println("enter the value of b= ");
        
        l=Integer.parseInt(stdin.readLine());
        b=Integer.parseInt(stdin.readLine());
        area=l*b;
        peri=2*(l+b);
        System.out.println("area="+area);
        System.out.println("peri="+peri);
    
    }
}