import java.util.ArrayList;
import java.util.List;

public class ListImmutable {
    public static void main(String[] args) {
        String[] items = {"apples", "banana", "mango"};
        List<String> list = List.of(items);
        System.out.println(list);
        
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
    }
}
