import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int value10 = 10;
        int valueTen = value10;

        System.out.println("Value10 = " + value10);
        System.out.println("ValueTen = " + valueTen);

        valueTen++;

        System.out.println("Value10 = " + value10);
        System.out.println("ValueTen = " + valueTen);

        int[] array5 = new int[5];
        int[] arrayFive = array5;

        System.out.println("array5 = " + Arrays.toString(array5));
        System.out.println("arrayFive = " + Arrays.toString(arrayFive));

        arrayFive[0] = 1;

        System.out.println("after array5 = " + Arrays.toString(array5));
        System.out.println("after arrayFive = " + Arrays.toString(arrayFive));

        arrayFive = new int[] {0, 5, 10, 15, 20, 25};
        modifyArray(array5);

        System.out.println("mod array5 = " + Arrays.toString(array5));
        System.out.println("mod arrayFive = " + Arrays.toString(arrayFive));
    }


    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }






}
