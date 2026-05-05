import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    int []number=new int[20];

    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 20 numbers");
        for (int i=0;i<20;i++){
            number[i]=sc.nextInt();
        }
    }

    void sortNumber(){
        Arrays.sort(number);
    }

    void dispaly(){
        System.out.println("Sorted number");
        for (int num:number){
            System.out.println(num+ " ");
        }
        System.out.println();
    }
}
