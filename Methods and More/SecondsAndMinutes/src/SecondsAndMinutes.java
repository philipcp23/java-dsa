public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            minutes = minutes % 60;
            String output = hours + "h " + minutes + "m " + seconds + "s";
            return output;
        } else {
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        } else {
            int hours = seconds / 3600;
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            String output = hours + "h " + minutes + "m " + remainingSeconds + "s";
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
