public class Main {

    public static void main(String[] args) {
        getEvenDigitSum(123456789);
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while(number != 0) {
            int lastDigit = number % 10;
            System.out.println(lastDigit + " is the last digit.");
            
            if (lastDigit % 2 == 0) {
                System.out.println(lastDigit + " is even.");
                sum += lastDigit;
                System.out.println("sum of last digit " + sum);
            }
            number /= 10;
        }
        System.out.println(sum);
        return sum;
    }
}
