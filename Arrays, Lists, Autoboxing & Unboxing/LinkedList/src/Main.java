import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Phil", 60.75);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setValue(12.50);
        System.out.println("Customer: " + customer.getName() + "'s balance: " + customer.getValue());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " : " + intList.get(i));
        }

        //intList.add(0, 0);
        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + " : " + intList.get(i));
        }
    }
}
