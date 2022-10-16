import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number :");
        float n1=sc.nextInt();
        System.out.println("Enter Second Number :");
        float n2=sc.nextInt();
        System.out.println("Enter Third Number :");
        float n3=sc.nextInt();
        System.out.println("Enter Fourth Number :");
        float n4=sc.nextInt();
        System.out.println("Enter Fifth Number :");
        float n5=sc.nextInt();
        System.out.println("Enter Sixth Number :");
        float n6=sc.nextInt();
        System.out.println("Enter Seventh Number :");
        float n7=sc.nextInt();
        System.out.println("Enter Eighth Number :");
        float n8=sc.nextInt();
        System.out.println("Enter Ninth Number :");
        float n9=sc.nextInt();
        System.out.println("Enter Tenth Number :");
        float n10=sc.nextInt();

        float sum=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
        double AM=sum/10.00;

        float Prod=n1*n2*n3*n4*n5*n6*n7*n8*n9*n10;
        double GM=pow(Prod,1/10.00);

        System.out.println("AM=" +AM);
        System.out.println("GM=" +GM);


    }
}