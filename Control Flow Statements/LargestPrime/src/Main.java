public class Main {
    public static void main(String[] args) {
       int x = getLargestPrime(21);
        System.out.println(x);
    }

    public static int getLargestPrime(int number) {
        if(number <= 1) {
            return -1;
        } else {
            int primeNumber = 1;
            for(int i = 1; i < number; i++) {
                primeNumber = (number % i == 0) ? i : primeNumber;
            }
            return (primeNumber != 1 ) ? getLargestPrime(primeNumber) : number;
        }

    }
}
