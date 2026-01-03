public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car("Toyota Camry");
        runRace(car);

        Car ferrari = new GasPoweredCar("Ferrari California", 22.5, 5);
        runRace(ferrari);

        Car tesla = new ElectricCar("Tesla Model 3", 150.0, 300);
        runRace(tesla);

        Car hybride = new HybridCar("Nissan Leaf", 180.0, 200, 4);
        runRace(hybride);

    }
    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}