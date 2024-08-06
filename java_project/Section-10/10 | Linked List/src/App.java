import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place delhi = new Place("Delhi", 1200);
        addPlace(placesToVisit, delhi);
        addPlace(placesToVisit, new Place("Delhi", 1200));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();
        
        while (!quitLoop) {
            System.out.print("Enter your choice: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);
            
            switch (menuItem) {
                case "F": System.out.println("User wants to go forward"); break;
                case "B": System.out.println("User wants to go Backwards"); break;
                case "L": System.out.println(placesToVisit); break;
                case "M": printMenu(); break;
                default: quitLoop = true; break;
            }
        }

    }

    private static void addPlace(LinkedList<Place> list, Place place ) {
        if (list.contains(place)) {
            System.out.println("Found Duplicate: " + place);
        }
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found Duplicate: " + place);
            }
        }
        list.add(place);
    }

    public static void printMenu() {
        System.out.println("""
                Available actions (select word or letter) :
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
