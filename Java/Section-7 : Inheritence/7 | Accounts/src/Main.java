public class Main {
    public static void main(String[] args) throws Exception {
        Account myAccount = new Account();
        // myAccount.setCustomerName("Rishabh Gokhe");
        // myAccount.setCustomerEmail("rishabhgokhe@gmail.com");
        // myAccount.setCustomerPhone(912345678);
        // myAccount.setBalance(5000);
        myAccount.depositFunds(500.45);
        myAccount.withdrawalFunds(200);
    }
}