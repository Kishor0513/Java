import java.util.Scanner;

public class Capet_Cost_Calculator {
    public static void main(String[] args) {
       /* Floor floorobj= new Floor(150,100);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width=sc.nextDouble();
        System.out.println("Enter the length: ");
        double length=sc.nextDouble();

        Carpet carpet1=new Carpet(500);

        Floor floor1=new Floor(width,length);

        Calculator calculator=new Calculator(floor1,carpet1);

        System.out.println(calculator.getTotalCost());
    }
}