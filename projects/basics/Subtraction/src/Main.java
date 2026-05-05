import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a= sc.nextInt();
        System.out.println("Enter Last Number:");
        int b= sc.nextInt();
        int sub=a-b;
        System.out.println("The Subtraction of two number is " +sub);

    }
}