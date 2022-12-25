public class BankAccount {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int contactNumber;

    private double deposit;
    public BankAccount(double accountNumber, double balance, String customerName, String email, int contactNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.contactNumber = contactNumber;

    }
    

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(Float accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }
    public  void  deposit(double deposit){
        this.deposit=deposit;
    }
    public void Deposit(double accountNumber, double balance, String customerName){
        double total=balance+this.deposit;
    }
}
