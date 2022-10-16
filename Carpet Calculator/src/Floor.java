public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = (width>0)?width:0;
        this.length = (length>0)?length:0;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        double area=this.width*this.length;
        return area;
    }
}
