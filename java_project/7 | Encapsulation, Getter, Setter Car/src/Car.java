public class Car {

    private int doors = 2;
    private String company = "Tesla";
    private String model = "Model 3";
    private String color = "White";
    private boolean convertible = true;

    public String getCompany() {
        return company;
    }
    public int getDoors() {
        return doors;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void carData() {
        System.out.println("Doors " + doors + " " + company + " " + model + " " + color + " " + convertible);
    }

}
