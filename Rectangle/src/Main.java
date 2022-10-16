import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float length,width,area,circumference;
        System.out.println("Enter the length and width of Rectangle: ");
        length=sc.nextFloat();
        width=sc.nextFloat();
        area=length*width;
        circumference=2*(length+width);
        System.out.println("The area of rectangle is: "+area+" and circumference is: "+circumference);
    }
}