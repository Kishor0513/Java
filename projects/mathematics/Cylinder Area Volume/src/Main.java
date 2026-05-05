import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius,height,area,volume;
        System.out.println("Enter the radius and height if Cyliner");
        radius= sc.nextDouble();
        height=sc.nextDouble();
        area=2*3.14159*radius*(radius+height);
        volume=3.14159*radius*radius*height;
        System.out.println("The Surface area of cylinder is: "+area + " and volume is: "+volume);

    }
}