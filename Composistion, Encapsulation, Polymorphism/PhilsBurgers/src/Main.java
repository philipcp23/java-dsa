import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Phil's Burger! Can we help you?");
        scanner.nextLine();


        System.out.println("----------Standard Hamburger no additions----------");
        Hamburger hamburger = new Hamburger(true, true, true, false);
        double price = hamburger.getPrice();
        System.out.println("hamburger.getPrice() = " + price);
        price = hamburger.addTax(price);
        System.out.println("The price of your hamburger is: "  + price + " dollars!");
        System.out.println("----------Add bacon----------");
        hamburger.addBacon();

    }
}
