public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, "Burger", price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice() + (extra1 == null? 0 : extra1.getAdjustedPrice()) + (extra2 == null? 0 : extra2.getAdjustedPrice()) + (extra3 == null? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "CHEESE" -> 15;
            case "TOMATO" -> 12;
            case "ONION" -> 10;
            default -> 0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item(extra1, "TOPPING", getExtraPrice(extra1));
        this.extra2 = new Item(extra2, "TOPPING", getExtraPrice(extra2));
        this.extra3 = new Item(extra3, "TOPPING", getExtraPrice(extra3));
    }

    public void printItemList() {
        printItem("BASE BURGER", getBasePrice());
        if (extra1!= null) extra1.printItem();
        if (extra2!= null) extra2.printItem();
        if (extra3!= null) extra3.printItem();
    }

    @Override
    public void printItem() {
        printItemList();
        System.out.println("-".repeat(30));
        printItem(getName(), getAdjustedPrice());
    }

}
