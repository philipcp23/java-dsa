import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInts = getInts(5);
        for (int i = 0; i < myInts.length; i++) {
            System.out.println("Element " + i +", typed value was " + myInts[i]);
        }
        System.out.println("The average is " + getAverage(myInts));
    }

    private static int[] getInts(int number) {
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;
    }







//        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myIntArray[0] = 50;
//        myIntArray[1] = 50;
//        myIntArray[5] = 50;
//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);
//        int[] newArray = new int[10];
//        printArray(newArray);
//
//
//        int[] _array = new int[10];
//        for (int i = 0; i < _array.length; i++) {
//            _array[i] = i * 10;
//        }
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i * 10;
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }


//    }
}



