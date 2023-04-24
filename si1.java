import java.io.*;
class si1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        int p,t,r,si;
        System.out.println("enter the values of p=");
        System.out.println("enter the values of t="); 
        System.out.println("enter the values of r=");


        p=Integer.parseInt(stdin.readLine());
        t=Integer.parseInt(stdin.readLine());
        r=Integer.parseInt(stdin.readLine());
        si=p*t*r/100;
        System.out.println("simple interest="+si);
    }
}