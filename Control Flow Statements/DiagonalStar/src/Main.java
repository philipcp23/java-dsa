public class Main {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int currentRow = 0;
            int currentColumn;
            for (int i = 1; i <= number; i++) {
                currentRow++;
                for (int j = number; j >= 1; j--) {
                    currentColumn = j;
                    if ((currentRow == 1) || (currentRow == number)) {
                        System.out.print("*");
                    } else if ((currentColumn == 1) || (currentColumn == number)) {
                        System.out.print("*");
                    } else if (currentColumn == currentRow) {
                        System.out.print("*");
                    } else if (currentColumn == number - currentRow + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
