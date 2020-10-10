import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branch) {
        if (findBranch(branch) == null) {
            this.branches.add(new Branch(branch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,
                               String customer,
                               double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customer, amount);
        }
        return false;
    }

    private Branch findBranch(String branch) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch check = this.branches.get(i);
            if (check.getName().equals(branch)) {
                return check;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String branchName, String customer, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customer, amount);
            return true;
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean transactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
            Customer branchCustomer = branchCustomers.get(i);//
                System.out.println("Customer: [" + (i+1) + "]" + branchCustomer.getName());
                if (transactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> arrTransactions = branchCustomer.getTransactions();
                    for (int j = 0; j < arrTransactions.size(); j++) {
                        System.out.println("[" + (i+1) + "] Amount " +
                        arrTransactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}



