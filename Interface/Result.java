public class Result extends Test {

    double total;

    public void display() {
        total = (sub[0] + sub[1] + sub[2] + sub[3]) / 4;
        put_number();
        put_marks();
        System.out.println("Total :"+total);
    }
    
}
