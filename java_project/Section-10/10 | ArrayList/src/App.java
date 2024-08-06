import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY",1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
       GroceryItem[] groceryArray = new GroceryItem[3];
       groceryArray[0] = new GroceryItem("Bread");
       groceryArray[1] = new GroceryItem("Milk");
       groceryArray[2] = new GroceryItem("Orange", "Fruit", 3);
       System.out.println(Arrays.toString(groceryArray));

       ArrayList<GroceryItem> groceryList = new ArrayList<>();
       groceryList.add(new GroceryItem("Butter"));
       groceryList.add(new GroceryItem("Eggs"));
       groceryList.add(new GroceryItem("Apples", "Fruit", 5));
       groceryList.add(1, new GroceryItem("Bread"));
       System.out.println(groceryList);
    }
}
