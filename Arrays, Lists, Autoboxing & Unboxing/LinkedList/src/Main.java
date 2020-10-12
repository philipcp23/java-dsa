public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Phil", 60.75);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setValue(12.50);
        System.out.println("Customer: " + customer.getName() + "'s balance: " + customer.getValue());
    }
}
