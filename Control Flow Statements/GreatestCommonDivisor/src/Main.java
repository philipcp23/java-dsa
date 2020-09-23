public class Main {

    public static void main(String[] args) {
        int x = getGreatestCommonDivisor(24, 16);
        System.out.println(x);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 || second >= 10) {
            if ((first >= 10) && (second >= 10)) {

                for (int i = (first < second) ? first : second; i > 1; i--) {
                    System.out.println("first i " + i);
                    System.out.println("first " + first + " and second "  + second);

                    if (first % i == 0 && second % i == 0) {
                        System.out.println("first2 " + first + " and second2 "  + second);
                        System.out.println("iterator " + i);
                        return i;
                    }



                }
            }
        }
        return -1;

    }
}
