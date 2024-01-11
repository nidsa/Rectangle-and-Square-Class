public class Rectangle {
    private double width;
    private double legnth;

    public Rectangle(double width, double length) {
        this.width = width;
        this.legnth = length;
    }

    public double getArea() {
        return width * legnth;
    }

    public double getPerimeter() {
        return 2 * (width + legnth);
    }
}
