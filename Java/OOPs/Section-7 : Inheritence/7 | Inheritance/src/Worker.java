public class Worker {

    public String name;
    public String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    
    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;
    }

    public double collectSalary() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", birthDate='" + birthDate + "'" +
            ", endDate='" + endDate + "'" +
            "}";
    }

    

}
