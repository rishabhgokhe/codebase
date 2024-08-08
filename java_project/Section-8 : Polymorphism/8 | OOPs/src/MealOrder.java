public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 450);
        } else {
            this.burger = new Burger(burgerType, 120);
        }
        this.drink = new Item(drinkType, "drink", 25);
        this.side = new Item(sideType, "side", 70);
    }

    public double getTotalPrice() {
        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void getItemList() {
        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("_".repeat(30));
        Item.printItem("YOUR ORDER TOTAL ", getTotalPrice());
    }

    public void addBurgerTopping(String extra1, String extra2,String extra3 ) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerTopping(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db) {
            db.addDeluxeToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }
    
    public void setDrinkSize(String drinkSize) {
        drink.setSize(drinkSize);
    }

}
