import java.util.Scanner;

public class Student {
    protected int roll_number;

    public void get_number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number: ");
        roll_number = sc.nextInt();
        sc.close();
    }

    public void put_number() {
        System.out.println("Roll number ="+roll_number);
    }
}
