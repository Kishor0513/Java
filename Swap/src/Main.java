import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int a= sc.nextInt();
        System.out.println("Enter second Number");
        int b= sc.nextInt();
        System.out.println("Before swap:"+a + " " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap: "+a + " " +b);
    }
}