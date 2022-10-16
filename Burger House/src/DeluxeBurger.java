public class DeluxeBurger extends Hamburger {

    @Override
    public void Addition1(String name, double price) {
        System.out.println("Cannot add any item to Delexe Burger!");

    }

    @Override
    public void Addition2(String name, double price) {

        System.out.println("Cannot add any item to Delexe Burger!");
    }

    @Override
    public void Addition3(String name, double price) {
        System.out.println("Cannot add any item to Delexe Burger!");

    }

    @Override
    public void Addition4(String name, double price) {
        System.out.println("Cannot add any item to Delexe Burger!");

    }

    public DeluxeBurger() {
        super("Deluxe Burger", "Chicken Keema   ", "Cheap Wheat", 19.10);
        Addition1("chips",5);
        Addition2("drinks",10);



        }


    }

