public class Main {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.setCompany("Tata");
        System.out.println("Company = " + car.getCompany());
        System.out.println( "Model = " + car.getModel());
        car.carData();
    }
}
