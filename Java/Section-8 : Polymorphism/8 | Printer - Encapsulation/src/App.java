public class App {
    public static void main(String[] args) throws Exception {
        Printer printer = new Printer(80, false);
        System.out.println("Total pages printed = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(15);
        System.out.printf("Current pages amount = %d, Total pages printed by printer = %d %n", pagesPrinted, printer.getPagesPrinted());
    }
}
