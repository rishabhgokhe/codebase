public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.length = length < 0 ? 0 : length;
        this.width = width < 0 ? 0 : width;
    }

    public double getArea() {
        return length * width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
