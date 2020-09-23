public class Main {

    public static void main(String[] args) {

        boolean x = canPack(2, 2, -11);
        System.out.println(x);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            int sumOfBags = bigCount*5 + smallCount;
            int leftOver = goal % 5;
            return (sumOfBags >= goal) && (leftOver <= smallCount);
        }
        return false;


       /* System.out.println("bigCount(" + bigCount+ ")" + " times 5 plus smallCount(" + smallCount + ") = " + (bigCount*5 + smallCount));
        System.out.println("goal = " + goal);
        System.out.println("goal % 5 = " + goal % 5);
        int leftOver = goal % 5;
        System.out.println("if leftover " +leftOver+ " is less than or equal to --> smallCount = " + smallCount);
        System.out.println("leftover " +leftOver+ " ");
        return ((bigCount*5 + smallCount) >= goal && leftOver <= smallCount);*/
    }
}
