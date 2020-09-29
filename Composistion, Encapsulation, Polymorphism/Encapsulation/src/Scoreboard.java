public class Scoreboard {
   private int score = 0;
   private int highScore = 100;
   private String name;

    public Scoreboard(int startingScore, int highScore, String name) {
        if (startingScore < 0) {
            startingScore = this.score;
        }
        this.highScore = highScore;
        this.name = name;
        System.out.println("Starting score = " + startingScore);
    }

    public int getScore() {
        return score;
    }

    public void increasePoints(int points) {
        score += points;
        System.out.println("Direct Hit, Increase Points = " + points);
    }

    public void getHighScore() {
        if (score > highScore) {
            System.out.println("New High Score = " + score + ": Player = " + name);
        } else {
            System.out.println("High Score = " + highScore);
        }
    }
}
