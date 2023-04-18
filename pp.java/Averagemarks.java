import java.util.Scanner;

public class Averagemarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter your name");
        String name = s.next();
        System.out.print("enter marksin three subjects :");
        int marks1 = s.nextInt();
        int marks2 = s.nextInt();
        int marks3 = s.nextInt();
        double average = (marks1 + marks2 + marks3 / 3.0);
        System.out.println("\n Name:" + name);
        System.out.println("Average:" + average);
        {
            s.close();
        }

    }
}