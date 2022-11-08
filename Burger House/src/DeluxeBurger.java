public class DeluxeBurger extends Hamburger {


    @Override
    public void Addition1(String name, double price) {
        System.out.println("Cannot add any item to Deluxe Burger!");

    }

    @Override
    public void Addition2(String name, double price) {

        System.out.println("Cannot add any item to Deluxe Burger!");
    }

    @Override
    public void Addition3(String name, double price) {
        System.out.println("Cannot add any item to Deluxe Burger!");

    }

    @Override
    public void Addition4(String name, double price) {
        System.out.println("Cannot add any item to Deluxe Burger!");

    }


    public DeluxeBurger() {
        super("Deluxe Burger", "Steak", "Baguette", 150);

    }
}

