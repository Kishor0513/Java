public class CreditCardApp {
    public static void main(String[] args) {
        CreditCard c1=new CreditCard("John",1000.0,100000.0);

        c1.chargeCard(500.00);
        c1.makePayment(300.00);

        System.out.println("Name: "+c1.getName());
        System.out.println("Balance: "+c1.getBalance());

        CreditCard c2=new CreditCard();

        System.out.println("Name: "+c2.getName());
        System.out.println("Balance: "+c2.getBalance());


    }
}