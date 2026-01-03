public class DeluxeBurger extends Burger {
    Item deluxe1;
    Item deluxe2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addDeluxeToppings(String extra1,String extra2,String extra3,String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new Item(extra4, "deluxe topping", 0);
        deluxe2 = new Item(extra5, "deluxe topping", 0);
    }

    @Override
    public void printItemList() {
        super.printItemList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }

    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
