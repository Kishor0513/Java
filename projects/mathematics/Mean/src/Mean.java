import java.util.Scanner;
public class Mean {
    int [] number=new int[5];
    int mean;

    void getData(){
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter number");
            number[i]=sc.nextInt();
        }
    }
    void calculate(){
        mean=(number[0]+number[1]+number[2]+number[3]+number[4])/5;
    }
    void display(){
        System.out.println("Mean is "+mean);
    }
}
