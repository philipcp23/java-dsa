public class Main {

    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Min Float Value: " +myMinFloat);
        System.out.println("Max Float Value: " +myMaxFloat);
        System.out.println("__________________________________");
        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Min Double Value: " +myMinDouble);
        System.out.println("Max Double Value: " +myMaxDouble);
        System.out.println("__________________________________");

        int i = 5 / 3;
        float f = 5f / 3f;
        double d = 5.00 / 3.00;
        System.out.println("Int value: " + i);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);


        System.out.println("_____Challenge_____");
        int myWeight = 180;
        double kiloGrams = 0.45359237 * myWeight;
        System.out.println("My weight in lbs converted to kilograms is : " + kiloGrams);

        double pi = 3.1415927d;
        double test = 3_000_000.4_567_890;
        System.out.println("PI value: " + pi);
        System.out.println("Double TEST: " + test);


    }
}


