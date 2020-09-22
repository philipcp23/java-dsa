public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; //  3
        System.out.println("1 + 2 = " + result);

        int previous = result;
        System.out.println("previous " + previous);
        result = result -1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previous = " + previous);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 + " + result);
        System.out.println("This is the result: " + result);
        // result = result + 1;
        result++;
        System.out.println("1 + 1 = " + result);
        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;

        if (isAlien == true) {
            System.out.println("It is an ET");
            System.out.println("ET PHONE HOME");
        }

        int topScore = 81;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        } else if ((topScore > 90) && (topScore < 100)) {
            System.out.println("You got a fantastic score");
        } else if ((topScore > 80) && (topScore <90)) {
            System.out.println("Great work, keep at it!");
        } else if ((topScore > 70) && (topScore < 80)) {
            System.out.println("Great work, but you need to work harder");
        } else {
            System.out.println("Not great, but don't give up!");
        }

        int secondTopScore = 95;
        if ((topScore > 90) || secondTopScore <= 90) {
            System.out.println("Either or both conditions are true!");
        }

        int newvalue = 50;
        if (newvalue == 50) {
            System.out.println("This is true because you used double equals");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("this is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }






























    }
}
