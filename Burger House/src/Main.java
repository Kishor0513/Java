public class Main {
    public static void main(String[] args) {

        String customer1="Kishor";
        Hamburger Kishor=new Hamburger("Hamburger","Chicken","Wheat",100);

        Kishor.Addition1("Extra Cheese",20);
        Kishor.Addition2("Extra Tomato",5);
        Kishor.Addition3("Extra Myo",10);
        Kishor.Addition4("Extra Sauce",5);

        double price=Kishor.itemizeburger();

        System.out.println("Total Burger Price for "+customer1+" is"+price);

        System.out.println();
        System.out.println();

        String customer2="Ram";

        DeluxeBurger ramBurger=new DeluxeBurger();

        ramBurger.Addition1("Extra Cheese",20);
        ramBurger.Addition2("Extra Tomato",5);
        ramBurger.Addition3("Extra Myo",10);
        ramBurger.Addition4("Extra Sauce",5);

        double price2=ramBurger.itemizeburger();

        System.out.println("Totol Burger Price for "+customer2+" is "+price2);

        String customer3="Shyam";

        HealthyBurger shyamBurger=new HealthyBurger("Chicken Breast",200);
        shyamBurger.Addition1("Extra Cheese",20);
        shyamBurger.Addition2("Extra Tomato",5);
        shyamBurger.Addition3("Exra Myo",10);
        shyamBurger.Addition4("Extra Sauce",5);

        shyamBurger.addHealthyAddition1("Egg",20);
        shyamBurger.addHealthyAddition2("Protien Shake",50);

        double price3=shyamBurger.itemizeburger();

        System.out.println("Total Burger Price for "+customer3+" is "+price3);


    }
}