public class Main {
    public static void main(String[] args) {
        boolean b1 = BarkingDog.shouldWakeUp(true, 22);
        BarkingDog.shouldWakeUp(false, 2);
        boolean t4 = BarkingDog.shouldWakeUp(true, 4);
        BarkingDog.shouldWakeUp(true, -1);

        System.out.println("true,22 = " + b1);
        System.out.println("true,4 = " + t4);
    }
}
