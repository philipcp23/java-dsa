public class Main {
    public static void main(String[] args) {

        double d = 20.00d;
        double dd = 80.00d;

        double addMultiplyDoubles = (d + dd) * 100.00;
        System.out.println("Steps 1, 2, 3 = " + addMultiplyDoubles);

        double remainderResult = addMultiplyDoubles % 40.00d;
        System.out.println("Remainder: " + remainderResult);

        boolean isNoRemainder = (remainderResult == 0.0) ? true : false;
        System.out.println("Value of the boolean isNoRemainder: " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("DID NOT GET REMAINDER!!!");
        }

    }
}
