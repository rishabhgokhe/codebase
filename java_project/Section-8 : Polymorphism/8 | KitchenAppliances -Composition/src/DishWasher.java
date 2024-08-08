public class DishWasher {
    public boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Dishes are being washed.");
            hasWorkToDo = false;
        } else {
            System.out.println("All dishes are already washed.");
        }
    }
}
