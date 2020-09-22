public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double int1, double int2) {
        if (((int) (int1 * 1000)) == ((int) (int2 * 1000))) {
            return true;
        } else {
            return false;
        }
    }
}
