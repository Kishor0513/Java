import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a= sc.nextInt();
        System.out.println("Enter second Number");
        int b= sc.nextInt();
        System.out.println("Enter third Number");
        int c= sc.nextInt();
        System.out.println("Enter Fourth Number");
        int d= sc.nextInt();
        System.out.println("Enter Fifth Number");
        int e= sc.nextInt();
        int sum=a+b+c+d+e;
        int avg=sum/5;
        System.out.println("The Average is: "+avg);
    }
}