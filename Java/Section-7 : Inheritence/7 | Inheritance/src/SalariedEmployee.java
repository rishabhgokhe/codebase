public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;
    

    public SalariedEmployee(String name, String birthDate, String hiredate ,double annualSalary) {
        super(name, birthDate, hiredate);
        this.annualSalary = annualSalary;
    }


    @Override
    public String toString() {
        return "{" +
            " annualSalary='" + annualSalary + "'" +
            ", isRetired='" + isRetired + "'" +
            "}" + super.toString() ;
    }

    @Override
    public double collectSalary() {

        double paycheck = annualSalary/12;
        double adjustedPay = isRetired ? 0.9 * paycheck : paycheck ;

        return (int) adjustedPay;
    }

    public void retire() {
        terminate("30/07/2024");
        isRetired = true;
    }



}
