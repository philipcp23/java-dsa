public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean isPlaying = summer ?
                              temperature >= 25 && temperature <= 45 :
                              temperature >= 25 && temperature <= 35;
        return isPlaying;

    }
}
