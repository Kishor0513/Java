public class Transaction {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();


        BankAccount obj1 = new BankAccount("Kishor");
        obj1.setCustomerName("Kishor");
        obj1.setAccountNumber();
        obj1.deposit(5000.0);
        obj1.withdraw(2000.0);
        System.out.println(obj1.toString());



        BankAccount obj3=new BankAccount("Ram",10000.00);
        obj3.setCustomerName("Ram");
        obj3.setBalance(10000.00);
        obj3.setAccountNumber();
        obj3.deposit(1000.0);
        obj3.withdraw(2000.0);
        obj3.toString();

    }
}