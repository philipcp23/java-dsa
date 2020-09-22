public class Main {

    public static void main(String[] args) {
        int x = sumFirstAndLastDigit(2025);
        System.out.println(x);
    }
    private static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        System.out.println("Last digit = " + lastDigit);
        System.out.println("To find the last digit take the modulus of the parameter, which is number.");

        if (number < 0) {
            return -1;
        }
        while(number>=10){
            number /= 10;
            System.out.println("Number divided by 10 = " + number);
            System.out.println("Dividing the number by 10 until it is a single digit will return a single digit," +
                    "which is the first digit and only digit remaining.");
        }
        int sum = number + lastDigit;
        System.out.println("The number is " + number + " plus the last digit, " + lastDigit + " = " + sum);
        return sum;

    }
}


