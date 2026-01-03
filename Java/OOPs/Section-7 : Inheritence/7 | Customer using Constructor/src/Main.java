public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCustomerEmail());
        System.out.println("₹" + customer.getCreditLimit());

        Customer customer2 = new Customer("Rish", "rishgokhe@gmail.com", 60000);
        System.out.println(customer2.getCustomerName());
        System.out.println(customer2.getCustomerEmail());
        System.out.println("₹" + customer2.getCreditLimit());

        Customer customer3 = new Customer("Rishu", "rishugokhe@gmail.com");
        System.out.println(customer3.getCustomerName());
        System.out.println(customer3.getCustomerEmail());
        System.out.println("₹" + customer3.getCreditLimit());
    }
}