public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        } else if (hourOfDay >= 0 && hourOfDay < 8) {
            return true;
        } else return hourOfDay == 23;
    }
}
