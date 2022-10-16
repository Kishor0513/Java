public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public Floor getFloor() {
        return floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }
    public double totalArea(){
        return this.floor.getArea()*this.carpet.getCost();
    }
}
