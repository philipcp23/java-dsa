import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void reverse(int[] array) {
       int maxIndex = array.length - 1;
       int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }


    public static void main(String[] args) {
        int[] array =  { 1, 5, 3, 7, 11, 9, 15 };
        String arr = Arrays.toString(array);
        System.out.println(arr);

        reverse(array);
        arr = Arrays.toString(array);
        System.out.println(arr);

    }
}
