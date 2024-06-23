public class Customer {

    private String customerName;
    private String customerEmail;
    private int creditLimit;

    public Customer(String customerName, String customerEmail, int creditLimit) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.creditLimit = creditLimit;
    }

    public Customer() {
        this("Rishabh", "rishabhgokhe@gmail.com");
    }

    public Customer(String customerName, String customerEmail) {
        this(customerName, customerEmail, 80000);
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
