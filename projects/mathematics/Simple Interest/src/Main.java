import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float P, T, R, SI;
        System.out.println("Enter the Principle: ");
        P = sc.nextFloat();
        System.out.println("Enter the Time: ");
        T = sc.nextFloat();
        System.out.println("Enter the Rate: ");
        R = sc.nextFloat();
        SI = P * T * R / 100;
        System.out.println("The Simple Interest is :" + SI);
    }
}