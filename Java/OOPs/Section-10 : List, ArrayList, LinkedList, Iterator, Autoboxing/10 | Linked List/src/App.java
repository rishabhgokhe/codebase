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
        addPlace(placesToVisit, new Place("Mumbai", 1400));
        addPlace(placesToVisit, new Place("Kolkata", 1500));
        addPlace(placesToVisit, new Place("Chennai", 1600));

        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }

            System.out.print("Enter your choice: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F":
                    if (!forward) {   // Reversing Direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();   // Adjusting position forwards
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Your next location is " + iterator.next());
                    }
                    break;

                case "B":
                    if (forward) {    // Reversing Direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();  // Adjusting position backward
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Your previous location was " + iterator.previous());
                    }
                    break;

                case "L": System.out.println(placesToVisit); break;
                case "M": printMenu(); break;
                default: quitLoop = true; break;
            }
        }

        scanner.close();

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