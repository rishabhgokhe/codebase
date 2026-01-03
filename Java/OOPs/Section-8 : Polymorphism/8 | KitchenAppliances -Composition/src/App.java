public class App {
    public static void main(String[] args) throws Exception {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();

    }
}
