import java.util.Random;

public class BankAccount {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int contactNumber;

   private  boolean isEnrolledForMobileBanking;
   private  boolean isDebitCardAssigned;

   public BankAccount(){
       this.accountNumber=0.0;
       this.balance=0.0;
       this.customerName="";
       this.email="";
       this.contactNumber=0;
       this.isEnrolledForMobileBanking=false;
       this.isDebitCardAssigned=false;
   }

    public BankAccount(String customerName){
       this.customerName=customerName;
    }

    public BankAccount(String customerName,double balance){
       this.customerName=customerName;
       this.balance=balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void  setAccountNumber(){
        Random random=new Random();
        this.accountNumber=random.nextInt(999999999);
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

    public void deposit(double amount){
       if(amount>0){
           this.balance += amount;
           System.out.println("Account Info: "+
                   "customerName = "+customerName+
                   ", account Number = "+accountNumber+
                   ", deposit = "+amount+
                   ", balance = "+balance);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount){
       if (amount>0 && amount<=this.balance){
           this.balance -=amount;
           System.out.println("Account Info: "+
                   "customerName = "+customerName+
                   ", account Number = "+accountNumber+
                   ", withdraw = "+amount+
                   ", balance = "+balance);
       }
       else{
            System.out.println("Invalid Amount");
        }
    }

    public String toString(){
       return "Account Info: "+
               "customerName = "+customerName+
               ", account Number = "+accountNumber+
               ", balance = "+balance;
    }
}
