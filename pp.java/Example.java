 import java.io.*;
 public class Example
 {
    public static void main(String args[])throws IOException
    {
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(i);
        System.out.println("Enter the course");
        String course=b.readLine();
        System.out.println("keonics:"+ course);
    }
 }
