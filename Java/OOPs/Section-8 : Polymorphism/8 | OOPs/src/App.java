public class App {
    public static void main(String[] args) throws Exception {
        Item pizza = new Item("pizza", "snake", 250);
        pizza.printItem();
        pizza.setSize("large");
        pizza.printItem();
        System.out.println("Your total bill " + pizza.getAdjustedPrice());

        Item onion =  new Item("onion", "topping", 6);
        onion.printItem();

        Burger burger = new Burger("regular", 120);
        burger.addToppings("ONION", "CHEESE", "TOMATO");
        burger.printItem();

        MealOrder mealOrder = new MealOrder();
        mealOrder.addBurgerTopping("TOMATO", "CHEESE", "ONION");
        mealOrder.setDrinkSize("LARGE");
        mealOrder.getItemList();

        MealOrder secondMeal = new MealOrder("veggie", "thumbs-up", "chili");
        secondMeal.addBurgerTopping("TOMATO", "CHEESE", "ONION");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.getItemList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "thumbs-up", "fries");
        deluxeMeal.addBurgerTopping("ONION", "TOMATO", "CHEESE", "ORIGANO", "CHILI");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.getItemList();
    }
}
