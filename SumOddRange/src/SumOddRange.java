

public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

   public static int sumOdd(int start, int end) {
       int sumOddNumbers = 0;
       if (end >= start && end >= 0 && start >= 0) {
           for (int i = start; i <= end; i++) {
               if (isOdd(i)) {
                   sumOddNumbers += i;
               }
           }
           System.out.println("The sum of all the damn odd numbers = " + sumOddNumbers);
           return sumOddNumbers;
       } else {
           return -1;
       }
   }
}
