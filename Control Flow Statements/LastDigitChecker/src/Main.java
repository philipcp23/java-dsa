public class Main {
    
    public static void main(String[] args) {
        hasSameLastDigit(45, 67, 89);
        hasSameLastDigit(44, 66, 99);
        hasSameLastDigit(41, 22, 71);
        hasSameLastDigit(23, 32, 42);
        hasSameLastDigit(9, 99, 999);
        isValid(100);
    }
    
    public static boolean hasSameLastDigit(int x1, int y1, int z1) {
        if ((x1 >= 10 && x1 <= 1000) && (y1 >= 10 && y1 <= 1000) && (z1 >= 10 && z1 <= 1000)) {
            int x2 = 0, y2 = 0, z2 = 0;
            x2 = x1 % 10;
            y2 = y1 % 10;
            z2 = z1 % 10;
            if (x2 == y2 || x2 == z2 || y2 == z2) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }
}
