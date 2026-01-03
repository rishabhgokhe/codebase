public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    protected void runEngine() {
        System.out.println("Engine running.");
    }

    public void drive() {
        System.out.println("Car is driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    public String getDescription() {
        return description;
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    public void runEngine() {
        System.out.printf("Gas -> Car is running, average %.1f km per liter, type is %s%n", avgKmPerLiter, getClass().getSimpleName());
    }
    
}


class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Electric -> Battery is charging, capacity %d kWh, type is %s%n", batterySize, getClass().getSimpleName());
    }

    @Override
    public void runEngine() {
        System.out.printf("Electric -> Car is running, average %.1f km per charge, type is %s%n", avgKmPerCharge, getClass().getSimpleName());
    }
    
}

class HybridCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;
    private int cylinders = 6;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerCharge, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> Battery is charging, capacity %d kWh, all %d cylinders are fired up, type is %s%n", batterySize, cylinders, getClass().getSimpleName());
    }

    @Override
    public void runEngine() {
        System.out.printf("Hybrid -> Car is running, average %.1f km per charge, average %.1f km per liter, type is %s%n", avgKmPerCharge, avgKmPerCharge / cylinders, getClass().getSimpleName());
    }
    
}