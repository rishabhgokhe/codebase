public class HourlyEmployee extends Employee {

    private double hourlyPayRate;


    public HourlyEmployee(String name, String birthDate, String hireDate ,double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double collectSalary() {
        return 48 * hourlyPayRate;
    }

    public double getDoubleSalary() {
        return 2 * collectSalary();
    }


}
