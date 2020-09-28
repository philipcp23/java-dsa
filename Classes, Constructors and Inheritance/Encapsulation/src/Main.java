public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.name = "Phil";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 500;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//
//        Scoreboard scoreboard = new Scoreboard(-5, 500, "Phil");
//        scoreboard.getHighScore();
//        scoreboard.increasePoints(200);
//        System.out.println("Current score = " + scoreboard.getScore());
//        scoreboard.increasePoints(400);
//        System.out.println("Current score = " + scoreboard.getScore());
//        scoreboard.getHighScore();


        Printer printer = new Printer(50, true);
        System.out.println("Initial page count " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(5);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());





















    }

}
