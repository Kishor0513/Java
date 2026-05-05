import java.util.Scanner;

public class Test extends Student {
    double[] sub = new double[4];

    public void get_marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 subject marks:");

        for (int i = 0; i < 4; i++) {
            sub[i] = sc.nextDouble();
        }
        sc.close();
    }

    public void put_marks(){
        System.out.println("Marks in Sub1 "+ sub[0]+"\n");
        System.out.println("Marks in Sub2 "+ sub[1]+"\n");
        System.out.println("Marks in Sub3 "+ sub[2]+"\n");
        System.out.println("Marks in Sub4 "+ sub[3]+"\n");
    }
}
