public class Account {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhone;

    public Account() {
        this(647920286, 5473, "Rishabh", "rishabhgokhe@gmail.com", 872879379);
        System.out.println("Constructor Working");
    }

    public Account(int accountNumber, double balance, String customerName, String customerEmail, int customerPhone) {
        System.out.println("Constructor with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("₹ " + depositAmount + " credited to your account. Current Balance = ₹ " + this.balance);
    }

    public void withdrawalFunds(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Insufficient amount. Your current balance is ₹ " + this.balance);
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("₹ " + withdrawalAmount + " debited from your account. Your current balance is ₹ " + this.balance );
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
    
    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int number) {
        this.customerPhone = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
    this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNum) {
        this.accountNumber = accountNum;
    }

}