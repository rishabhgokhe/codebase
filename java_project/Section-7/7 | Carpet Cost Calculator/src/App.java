public class App {
    public static void main(String[] args) throws Exception {
        Floor floor = new Floor(5, 20);
        Carpet carpet = new Carpet(4.6);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("The total cost of carpet is " + calculator.getTotalCost());
    }

}
