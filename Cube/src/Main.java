import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n= sc.nextInt();
        int c=n*n*n;
        System.out.println("The cube of number is: "+c);
    }
}