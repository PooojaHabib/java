import java.io.*;
class sq1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        int a,area,peri;
        System.out.println("Enter the value of a:");
        a=Integer.parseInt(stdin.readLine());
        area=a*a;
        peri=4*a;
        System.out.println("area:="+area);
        System.out.println("perimeter:="+peri);
        
    }
        
    
}