public class Main {
    public static void main(String[] args) {
        boolean x = isPalindrome(-1221);
        boolean y = isPalindrome(71717);
        boolean z = isPalindrome(11212);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

        public static boolean isPalindrome(int number){
            int reverse = 0, num = number;

            while(number != 0) {
                int lastDigit = number % 10;
                System.out.println("Last digit: " + lastDigit);
                System.out.println("Reverse before calculation: " + reverse);
                reverse = reverse * 10 + lastDigit;
                System.out.println("Reverse after multiply by 10 then add " + lastDigit + " <-lastDigit, -> reverse = " + reverse);
                System.out.println("Number before divided by 10: " + number);
                number /= 10;
                System.out.println("Number after divided by 10: " + number);
            }
            System.out.println("This is num: " + num + "\nThis is reverse: " + reverse);
            return num == reverse;
        }
}
