public class Main {
    public static void main(String[] args) {

        String customer1="Kishor";
        Hamburger Kishor=new Hamburger("Hamburger","Steak ","Baguette",100);

        Kishor.Addition1("Extra Cheese",20);
        Kishor.Addition2("Extra Tomato",5);
        Kishor.Addition3("Extra Mayonnaise",10);
        Kishor.Addition4("Extra Sauce",5);

        double price=Kishor.itemizeburger();

        System.out.println("Total Burger Price for "+customer1+" is "+price);

        System.out.println();
        System.out.println();

        String customer2="Prabesh ";

        DeluxeBurger PrabeshBurger=new DeluxeBurger();

        PrabeshBurger.Addition1("Extra Cheese",20);
        PrabeshBurger.Addition2("Extra Tomato",5);
        PrabeshBurger.Addition3("Extra Mayonnaise",10);
        PrabeshBurger.Addition4("Extra Sauce",5);

        System.out.println("Added Extra Coke and Chips ");

        double price2=PrabeshBurger.itemizeburger();

        System.out.println("Added Extra Coke and Chips ");

        System.out.println("Totol Burger Price for "+customer2+" is "+price2);

        System.out.println();
        System.out.println();

        String customer3="Sunil ";

        HealthyBurger sunilBurger=new HealthyBurger("Chicken Breast",200);

        sunilBurger.Addition1("Extra Lettuce",20);
        sunilBurger.Addition2("Extra Tomato",5);
        sunilBurger.Addition3("Extra Beetroot ",15);
        sunilBurger.Addition4("Extra Carrot",10);

        sunilBurger.addHealthyAddition1("Egg",30);
        sunilBurger.addHealthyAddition2("Protein Shake",20);

        double price3=sunilBurger.itemizeburger();

        System.out.println("Total Burger Price for "+customer3+" is "+price3);


    }
}