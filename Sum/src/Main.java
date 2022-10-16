import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter first Number:");
        int x=myObj.nextInt();
        System.out.println("Enter last Number:");
        int y=myObj.nextInt();
        int sum=x+y;
        System.out.println("Sum of two number is"+sum);
    }
}