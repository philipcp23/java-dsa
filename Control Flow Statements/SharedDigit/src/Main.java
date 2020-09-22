public class Main {

    public static void main(String[] args) {
        //hasSharedDigit(23, 43);
        //hasSharedDigit(1000, -1);
        hasSharedDigit(12, 43);
    }

    public static boolean hasSharedDigit(int x1, int y1) {
        int x2 = 0; int y2 = 0;
        if ((x1 >= 10 && x1 <= 99) && (y1 >= 10 && y1 <= 99)) {
            x2 = x1 % 10;
            x1 /= 10;
            y2 = y1 % 10;
            y1 /= 10;
            System.out.println("x2 " + x2);
            System.out.println("y2 " + y2);
            System.out.println("x1 " + x1);
            System.out.println("y1 " + y1);
            if (x1 == x2 || x1 == y1 || x1 == y2 || x2 == y1 || x2 == y2 || y1 == y2) {
                return true;
            }
        }
        return false;
    }
}

