public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Phil", 500);
        //System.out.println("New score is " + newScore);
        calculateScore(10);
        calculateScore();
        //Challenge//
        double x = calcFeetAndInchesToCentimeter(1, 13);
        System.out.println(" return cm " + x);
        calcFeetAndInchesToCentimeter(100);
    }

    public static int calculateScore(String playerName, int score) {
        //System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        //System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        //System.out.println("No player name or score");
        return 0;
    }

    /////////////// Challenge //////////////////
    //
    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            System.out.println("Conversion feet to cm " + centimeters);
            centimeters += inches * 2.54;
            System.out.println("Conversion inches to cm " + centimeters);
            System.out.println(feet + "ft, " + inches + "in = " + centimeters + "cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeter(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) (inches / 12);
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeter(feet, remainingInches);
        }
    }


