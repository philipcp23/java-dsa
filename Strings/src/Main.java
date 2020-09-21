public class Main {
    public static void main(String[] args) {
        // ALL PRIMITIVE DATA TYPES
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String s = "This is a string";
        System.out.println("My string is equal to: " + s);
        s = s + ", I added on to at the end.";
        System.out.println("My string is equal to: " + s);
        s = s + " \u00A9 2020";
        System.out.println(s + " plus the copyright");
        String numberStr = "456.432";
        System.out.println(numberStr + " is a number string. " + s);

        String lastS = "10";
        int myInt = 50;
        lastS = lastS + myInt;
        System.out.println("lastS: " + lastS);

        double doubleNumber = 120.457d;
        lastS = lastS + doubleNumber;
        System.out.println("lastS 2.: " + lastS);




    }
}
