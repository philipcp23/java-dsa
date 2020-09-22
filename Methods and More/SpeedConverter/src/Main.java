

public class Main {
    public static void main(String[] args) {

        long toMphOne = toMilesPerHour(1.5);
        printConversion(1.5);
        
        long toMphTwo = toMilesPerHour(10.25);
        printConversion(10.25);

        long toMphThree = toMilesPerHour(-5.6);
        printConversion(-5.6);

        long toMphFour = toMilesPerHour(25.42);
        printConversion(25.42);

        long toMphFive = toMilesPerHour(75.114);
        printConversion(75.114);
        
        
    }

    private static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour * 0.62137119223733);
    }

    private static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Valid");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
