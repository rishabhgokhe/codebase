public class Item {

    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getName() {
        return (size + " " + name);
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch(size) {
            case "SMALL" -> getBasePrice() * 0.9;
            case "MEDIUM" -> getBasePrice();
            case "LARGE" -> getBasePrice() * 1.1;
            default -> throw new IllegalArgumentException("Invalid size: " + size);
        };
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public static void printItem(String name, double price) {
        System.out.printf("%-20s: $%.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }


}
