public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private Refrigerator refrigerator;
    private DishWasher dishwasher;

    public SmartKitchen() {
        coffeeMaker = new CoffeeMaker();
        refrigerator = new Refrigerator();
        dishwasher = new DishWasher();
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasheFlag) {
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        refrigerator.setHasWorkToDo(fridgeFlag);
        dishwasher.setHasWorkToDo(dishWasheFlag);
    }

    public void doKitchenWork() {
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishwasher.doDishes();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }
    public Refrigerator getRefrigerator() {
        return refrigerator;
    }
    public DishWasher getDishWasher() {
        return dishwasher;
    }
}
