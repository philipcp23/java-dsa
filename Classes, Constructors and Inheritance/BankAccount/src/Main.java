public class Main {

    public static void main(String[] args) {
        VipCustomer pensHockey = new VipCustomer();
        System.out.println(pensHockey.getName());
        System.out.println(pensHockey.getCreditLimit());
        System.out.println(pensHockey.getEmail());
        System.out.println("---------------");
        VipCustomer pens2 = new VipCustomer("Pens2", 2);
        System.out.println(pens2.getName());
        System.out.println(pens2.getCreditLimit());
        System.out.println(pens2.getEmail());
        System.out.println("---------------");
        VipCustomer penguins = new VipCustomer("Pittsburgh Penguins", 100, "PittsburghPenguins@email.com");
        System.out.println(penguins.getName());
        System.out.println(penguins.getCreditLimit());
        System.out.println(penguins.getEmail());
        System.out.println("---------------");



//        BankAccount fred = new BankAccount();
//        System.out.println(fred.getCustomerName());
//
//
//
//        BankAccount three = new BankAccount("name", "email", "cell");
//        System.out.println(three.getCustomerName());
//
//
//        BankAccount philip = new BankAccount("2300XX5600",
//                                             100,
//                                             "Philip Paolo",
//                                             "philipcpaolo@gmail.com",
//                                             "724-882-1053");
//        philip.setEmail("0");
//        philip.setCustomerName("0");
//        philip.setPhoneNumber("0");
//        philip.setBalance(0.0);
//        philip.setAccountNumber("0");
//
//
//        String accountNumber = philip.getAccountNumber();
//        System.out.println(accountNumber);
//
//        String name = philip.getCustomerName();
//        System.out.println(name);
//
//        String phoneNumber = philip.getPhoneNumber();
//        System.out.println(phoneNumber);
//
//        String email = philip.getEmail();
//        System.out.println(email);
//
//        double balance;
//        balance = philip.getBalance();
//        System.out.println("Balance: " + balance);
//
//        philip.deposit(20);
//        philip.withdrawal(50);
//        philip.withdrawal(50);
//        philip.withdrawal(50);
    }

}
