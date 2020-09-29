import java.util.Scanner;

public class Main {

    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myArray = {10, 35, 20, 17, 18};
//        for (int i = 0; i <= myArray.length; i++) {
//            System.out.println("Throw ArrayIndexOutOfBoundsException: " + myArray[i]);
//        }
        int[] arrayInput = getIntegers(5);
        int[] sorted = sortArray(arrayInput);
        printArray(sorted);
    }

    private static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " values: ");

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
           System.out.println("Element " + i + ", value is " + array[i]);
       }
    }

    private static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i ++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i]  = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

