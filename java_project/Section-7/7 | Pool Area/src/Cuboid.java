public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height < 0 ? 0 : height;
    }
    
    public double getVolume() {
        return super.getArea() * height;
    }
    public double getHeight() {
        return height;
    }
}
