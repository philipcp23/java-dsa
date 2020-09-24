public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("xyz", 0.0, "fred flintstone", "thebowlingking@rockmail.com", "8675309");
        System.out.println("empty constructor");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("45678", 100.55, customerName, email, phoneNumber);
    }

    public void deposit(double money) {
        this.balance += money;
        System.out.println("Deposit of " + money);
        System.out.println("New balance is " + this.balance);
    }

    public void withdrawal(double money) {
        if (this.balance - money < 0) {
            System.out.println("Insufficient Funds\n" + "Balance = " + this.balance +
                    "\n You are trying to withdrawal " + money);
        } else {
            this.balance -= money;
            System.out.println("Withdrawal of " + money);
            System.out.println("New balance is " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
