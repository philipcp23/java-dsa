public class Main {
    public static void main(String[] args) {
        char c = 'D';
        char uniCode = '\u0044';
        char copyRight = '\u00A9';
        System.out.println(c);
        System.out.println(uniCode);
        System.out.println(copyRight);

        boolean boolTrue = true;
        boolean boolFalse = false;

        boolean isCustomerOverTwentyOne = false;
        if (isCustomerOverTwentyOne) {
            System.out.println("Over 21");
        } else
            System.out.println("Under 21");
    }
}
