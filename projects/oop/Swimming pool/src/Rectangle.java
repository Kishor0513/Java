public class Rectangle {
    private double width;
    private double length;


    //Constructor

    public Rectangle(double width, double length) {
        this.width = (width > 0) ? width : 0;
        this.length = (length > 0) ? length : 0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        double area = width * length;
        return area;
    }
}
