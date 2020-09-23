public class Main {

    public static void main(String[] args) {
        String numberString = "2018";
        System.out.println("numberString = " + numberString);

        int number = Integer.parseInt(numberString);
        System.out.println("number = " + number);

        numberString += 1;
        number += 1;

        System.out.println("numberString = " + numberString);
        System.out.println("number = " + number);
    }
}
