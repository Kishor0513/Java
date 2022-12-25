public class CreditCard {
    private String name;
    private double balance;
    private double limit;

    public CreditCard(){
        this.name="";
        this.balance=0.0;
        this.limit=0.0;
    }

    public CreditCard(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void chargeCard(double amount){
        if(amount>0 && amount<=limit){
            balance+=amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void makePayment(double amount){
        if(amount>0 && amount<=limit){
            balance-= amount;
        }
        else {
            System.out.println("Invalid Amount");
        }
    }
    public String toString(){
        return name+" , "+balance;
    }
}
