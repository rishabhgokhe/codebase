public class Refrigerator {

    public boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Food is being ordered.");
            hasWorkToDo = false;
        } else {
            System.out.println("All food is already ordered.");
        }
    }
}
