import java.util.Scanner;

public class Swimming_Pool_Volume_Calculator {
    public static void main(String[] args) {
        //Rectangle rectangle=new Rectangle(100,500);
        //Cuboid cuboid=new Cuboid(100,500,100);


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rectangle width: ");
        double width=sc.nextDouble();
        System.out.println("Enter the Rectangle length: ");
        double length= sc.nextDouble();

        Rectangle rectangleobj=new Rectangle(width,length);

        System.out.println("Ractangle.width "+ rectangleobj.getWidth());
        System.out.println("Rectangle.height "+ rectangleobj.getLength());
        System.out.println("Rectangle.area "+ rectangleobj.getArea());

       /* System.out.println("Enter the cuboid Width: ");
        double widthforCuboid= sc.nextDouble();
        System.out.println("Enter the Cuboid Length: ");
        double lengthforCuboid=sc.nextDouble();*/
        System.out.println("Enter the Cuboid height: ");
        double heightforCuboid=sc.nextDouble();

        Cuboid cuboidobj=new Cuboid(width,length,heightforCuboid);

        System.out.println("Cuboid.width "+cuboidobj.getWidth());
        System.out.println("Cuboid.length "+cuboidobj.getLength());
        System.out.println("Cuboid.area "+cuboidobj.getArea());
        System.out.println("Cuboid.height "+ cuboidobj.getHeight());
        System.out.println("Cuboid.Volume "+cuboidobj.getVolume());
    }
}