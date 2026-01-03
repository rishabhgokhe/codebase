public class App {
    public static void main(String[] args) throws Exception {
        Employee Rishabh = new Employee("Rishabh", "25/07/2004", "22/07/2024");
        System.out.println(Rishabh);
        System.out.println("Age = " + Rishabh.getAge());
        System.out.println("Salary = " + Rishabh.collectSalary());

        SalariedEmployee mayank = new SalariedEmployee("Mayank", "03/02/2007", "22/07/2024",800000);
        System.out.println(mayank);
        System.out.println("Mayank Salary = ₹" + mayank.collectSalary());
        mayank.retire();
        System.out.println(mayank);
        System.out.println("Mayank retired Salary = ₹" + mayank.collectSalary());

        HourlyEmployee jayant = new HourlyEmployee("Jayant", "15/08/2008", "22/07/2024", 1200);
        System.out.println(jayant);
        System.out.println("Jayant salary = ₹" + jayant.collectSalary());
        System.out.println("Jayant double bonus = ₹" + jayant.getDoubleSalary());
    }
}
