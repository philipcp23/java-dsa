import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to Phil's Burger! Can we help you?");
//        scanner.nextLine();



        System.out.println("----------Standard Hamburger no additions----------");
        Hamburger hamburger = new Hamburger("Traditional", "Regular", "Bun");
        System.out.println(hamburger.getPrice() + " standard price");
        hamburger.additions("tomato");
        hamburger.additions("lettuce");
        //hamburger.additions("onion");
        hamburger.additions("pickle");
        System.out.println(hamburger.getPrice() + " ending price");
        System.out.println("----------Healthy Hamburger add avocado additions----------");


    }
}
