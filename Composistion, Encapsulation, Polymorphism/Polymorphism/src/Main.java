/*
Polymorphism
 */

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot Here";
    }

    public String getName() {
        return name;
    }
}

class BackFuture extends Movie {
    public BackFuture() {
        super("Back To The Future");
    }

    @Override
    public String plot() {
        return "Marty and Doc";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Battle of the universe";
    }
}

class Rocky extends Movie {
    public Rocky() {
        super("Rocky");
    }

    @Override
    public String plot() {
        return "A boxer becomes the champ";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark attack";
        }
}

class ForgetIt extends Movie {
    public ForgetIt() {
        super("Forget It");
    }
    // NO PLOT
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("random number was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new BackFuture();
            case 2:
                return new StarWars();
            case 3:
                return new Rocky();
            case 4:
                return new Jaws();
            case 5:
                return new ForgetIt();
        }

        return null;
    }
}
