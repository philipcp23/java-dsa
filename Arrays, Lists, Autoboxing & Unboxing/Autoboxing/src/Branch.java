import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customer, double amount) {
        if (findCustomer(customer) == null) {
            this.customers.add(new Customer(customer, amount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customer, double amount) {
        Customer existing = findCustomer(customer);
        if (existing != null) {
            existing.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customer) {
        for (int i = 0; i < this.customers.size(); i ++) {
            Customer check = this.customers.get(i);
            if (check.getName().equals(customer)) {
                return check;
            }
        }
        return null;
    }
}
