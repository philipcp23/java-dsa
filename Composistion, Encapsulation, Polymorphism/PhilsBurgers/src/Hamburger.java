public class Hamburger {
    private String breadType;
    private String meat;
    private boolean lettuce;
    private boolean pickle;
    private boolean cheese;
    private boolean onion;
    private double price = 10.00;
    private double bacon = 1.00;
    private double doubleMeat = 3.00;
    private double tripleMeat = 5.00;

    public Hamburger(boolean lettuce, boolean pickle, boolean cheese, boolean onion) {
        this.breadType = "Bun";
        this.meat = "80/20";
        this.lettuce = lettuce;
        this.pickle = pickle;
        this.cheese = cheese;
        this.onion = onion;
    }

    public double getPrice() {
        return this.price;
    }

    public void addBacon() {
        this.price += bacon;
    }

    public void addDoubleMeat() {
        this.price += doubleMeat;
    }

    public void addTripleMeat() {
        this.tripleMeat += tripleMeat;
    }

    public double addTax(double price) {
        double tax = price * 0.07;
        return tax + price;
    }
}
