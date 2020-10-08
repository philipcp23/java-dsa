import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


//class IntClass {
//    private int value;
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//
//    public IntClass(int value) {
//        this.value = value;
//
//    }
//}

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        /*
        Your job is to create a simple banking application.
        There should be a bank class
        It should have an array list of Branches
        Each Branch should have an array list of Customers
        The Customer class should have an arrayList of Doubles(transactions)
        Customer: Name, and the ArrayList of doubles
        Branch: Need to be able to add a new customer and initial transaction amount.
        Also needs to add additional transactions for that customer/branch
        Bank: Add a new branch
        Add a customer to that branch with initial transaction
        Add a transaction for an existing customer for that branch
        Show a list of customers for a particular branch and optionally a list
        of their transactions
        Demonstration autoboxing and unboxing in your code
        Hint: Transactions
        Add data validation e.g. check if exists, or does not exist, etc.
        This about where you are adding the code to perform certain actions
         */



        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Phil");

        //ArrayList<int> intArrayList = new ArrayList<int>();
        //ArrayList<IntClass> intClass = new ArrayList<IntClass>();
        //intClass.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(10.0);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
           intArrayList.add(i);
           System.out.println(i + " --> " + intArrayList.get(i));
        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        System.out.println("--------------------------------------------");
        ArrayList<Double> dibble = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10; dbl += 0.5) {
            dibble.add(dbl);
        }

        for (int i = 0; i < dibble.size(); i++) {
            double value = dibble.get(i);
            System.out.println(i + " = " + value);
        }

    }

}
