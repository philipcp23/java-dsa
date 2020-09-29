public class HealthyBurger extends Hamburger{

    private double price = 8.00;

    private double avocado = 1.00;
    private double veggie = 1.00;

    public HealthyBurger(String meat) {
        super("Healthy", meat, "Brown Rye");
    }

    public void addAvocado() {
        System.out.println("Add avocado for " + avocado);
        price += this.avocado;
    }

    public void addVeggie() {
        System.out.println("Add veggie for " + veggie);
        price += this.veggie;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
