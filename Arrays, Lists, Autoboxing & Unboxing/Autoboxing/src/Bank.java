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
        for (int i = 0; i < this.branches.size(); i ++) {
            Branch check = this.branches.get(i);
            if (check.getName().equals(branch)) {
                return check;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean transactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println(
                    "Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers
                    = branch.getCustomers();
            int index = 0;
            for (Customer customer : branchCustomers) {
                customer = branchCustomers.get(index);
                System.out.println("Customer: "
                + "[" + (index+1) + "]");
                if (transactions) {
                    System.out.println("Transaction");
                    ArrayList<Double> transaction
                            = customer.getTransactions();
                    for (var t : transaction) {
                        System.out.println("[" +
                                (index+1) + "] Amount " +
                                transaction.get(index));
                    }
                }
                index++;
            }
            return true;
        } else {
            return false;
        }
    }






























}

