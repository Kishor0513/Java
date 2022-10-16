
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                return;
            case 2:
                System.out.println("Monday");
                return;
            case 3:
                System.out.println("Tuesday");
                return;
            case 4:
                System.out.println("Wednesday");
                return;
            case 5:
                System.out.println("Thursday");
                return;
            case 6:
                System.out.println("Friday");
                return;
            case 7:
                System.out.println("Saturday");
                return;
            default:
                System.out.println("Null");

        }
    }
}