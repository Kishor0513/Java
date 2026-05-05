public class HealthyBurger extends Hamburger {
    private String HealthyExtra1Name;
    private double HealthyExtra1Price;

    private String HealthyExtra2Name;
    private double HealthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, "BrownBread", price);
    }

    public void addHealthyAddition1(String name, double price) {
        this.HealthyExtra1Name = name;
        this.HealthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.HealthyExtra2Name = name;
        this.HealthyExtra2Price = price;
    }

    public double itemizeHealthyBurger() {

        System.out.println("Basic " + this.getName() + "on a" + this.getBreadRollType() + "bread roll type with" + this.getMeat() + ",price is" + this.getPrice());

        System.out.println("Added" + this.getAddition1Name() + "for an extra" + this.getAddition1Price());
        System.out.println("Added " + this.getAddition2Name() + " for an extra " + this.getAddition2Price());
        System.out.println("Added " + this.getAddition3Name() + " for an extra " + this.getAddition3Price());
        System.out.println("Added " + this.getAddition4Name() + " for an extra " + this.getAddition4Price());

        System.out.println("Added " + this.HealthyExtra1Name + " for an extra " + this.HealthyExtra1Price);
        System.out.println("Added " + this.HealthyExtra2Name + " for an extra " + this.HealthyExtra2Price);

        double basePrice = super.itemizeburger();
        double totalPrice = basePrice + this.HealthyExtra1Price + HealthyExtra2Price;

        return totalPrice;
    }
}
