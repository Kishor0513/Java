import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n= sc.nextInt();
        int s=n*n;
        System.out.println("The Square of number is: "+s);
    }
}