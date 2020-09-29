public class DeluxeBurger extends Hamburger {

    private double drink = 1.00;
    private double chips = 2.50;
    private double price = 10.00;

    public DeluxeBurger() {
        super("Deluxe", "Double Bacon Burger", "Pretzel Bun");
    }

    public void addDrink() {
        System.out.println(drink + " for adding drink");
        this.price += this.drink;
    }

    public void addChips() {
        System.out.println(chips + " for adding chips");
        this.price += chips;
    }

    @Override
    public void additions(String additions) {
        System.out.println("Can not add any additions to the Deluxe Burger... SORRY!");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
