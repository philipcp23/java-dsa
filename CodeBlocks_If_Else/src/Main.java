public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Phil", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Lex", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Petey", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jason", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("This is a test of 1000", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("This is a test of 500", highScorePosition);

    }

    private static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the leader board!");
    }

    private static int calculateHighScorePosition(int playerScore) {
        int scoreBoard = 4;
        if (playerScore >= 1000) {
            scoreBoard = 1;
        } else if (playerScore >= 500) {
            scoreBoard = 2;
        } else if (playerScore >= 100); {
            scoreBoard = 3;
        }
        return scoreBoard;
 }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        System.out.println("Your final score was: " + -1);
        return -1;
    }
}
