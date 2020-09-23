public class Main {

    public static void main(String[] args) {
        boolean x = isPerfectNumber(5);
        System.out.println(x);

        boolean a = isPerfectNumber(28);
        System.out.println(a);
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number <= 0) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
