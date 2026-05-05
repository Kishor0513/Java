public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void Addition1(String name,double price) {
        this.addition1Name = name;
        this.addition1Price= price;
    }

    public void Addition2(String name,double price) {
        this.addition2Name = name;
        this.addition2Price= price;
    }

    public void Addition3(String name,double price) {
        this.addition3Name = name;
        this.addition3Price= price;
    }

    public void Addition4(String name,double price) {
        this.addition4Name = name;
        this.addition4Price= price;
    }

    public double itemizeburger(){
        System.out.println("Basic " +this.name+ " on a "
                +this.breadRollType+ " bread roll type with "
                +this.meat+ " , price is "
                +this.price);

        System.out.println("Added " +this.addition1Name+ " for an extra " +this.addition1Price);
        System.out.println("Added " +this.addition2Name+ " for an extra " +this.addition2Price);
        System.out.println("Added " +this.addition3Name+ " for an extra " +this.addition3Price);
        System.out.println("Added " +this.addition4Name+ " for an extra " +this.addition4Price);

        double TotalPrice=this.price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
        return TotalPrice;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }
}
