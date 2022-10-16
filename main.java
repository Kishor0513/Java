import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x ,y, mul;
        System.out.println("Enter first number: ");
        x=sc.nextInt();
        System.out.println("Enter second number: ");
        y=sc.nextInt();
        mul=x*y;
        System.out.println("The Multiply is: "+mul);
    }
}
