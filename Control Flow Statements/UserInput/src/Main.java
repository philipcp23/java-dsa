import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sumOfNumbers = 0;

        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int numbers = scanner.nextInt();
                sumOfNumbers += numbers;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sumOfNumbers);
        scanner.close();
    }
}

/*      Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter you name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }

        } else {
            System.out.println("Unable to parse year of birth");
        }
        System.out.println(hasNextInt);
        scanner.close();
    }*/