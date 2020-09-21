public class Main {
    public static void main(String[] args) {
        String x = SecondsAndMinutes.getDurationString(125, 59);
        System.out.println(x);

        String y = SecondsAndMinutes.getDurationString(3600);
        System.out.println(y);

    }
}
