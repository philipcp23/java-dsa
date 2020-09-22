public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        boolean x = isPrime(5);
        System.out.println("IS prime " + x);


        for (int i = 0; i < 5; i++) {
            System.out.println("loop " + i + " hello!");
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("1. 10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("2. 10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("------------------------------");
        int primeNumbers = 0;
        for (int i = 200; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number = " + i);
                primeNumbers++;
                System.out.println("Total prime numbers " + primeNumbers);
                if (primeNumbers == 3) {
                    break;
                }

            }

        }
    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n% i == 0) {
                return false;
            }
        }
        return true;
    }


















    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }
}

