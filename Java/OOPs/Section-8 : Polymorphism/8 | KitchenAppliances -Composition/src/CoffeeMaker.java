public class CoffeeMaker {
    
    public boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Coffee is being brewed.");
            hasWorkToDo = false;
        } else {
            System.out.println("Coffee is already brewed.");
        }
    }

}
