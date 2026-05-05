import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float celsius,fahrenheit;
        System.out.println("Enter temperature in celsius: ");
        celsius=sc.nextFloat();
        fahrenheit=(celsius*9/5)+32;
        System.out.println("The Celsius: "+celsius +" fahrenheit: "+fahrenheit);
    }
}